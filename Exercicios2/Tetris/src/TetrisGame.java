package src;

import java.util.ArrayList;

public class TetrisGame {
    private ArrayList<Block> block_queue = new ArrayList<Block>();
    private BlockGenerator blockGenerator = new BlockGenerator();
    private int max_queue_size = 3;

    public double tile_per_frame = 0.05;
    private double current_gravity = 0.0;

    public boolean changed = false;

    private int size_x = 10;
    private int size_y = 12;
    private int[][] game_grid = new int[size_y][size_x];

    protected Block current_block;
    // DirectionsEnum.java
    private static int[][] DIRECTIONS = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public TetrisGame() {
        gen_block_queue();
        next_block();
        System.out.println(current_block.pos[0] + " " + current_block.pos[1]);
    }

    private void gen_block_queue() {
        for (int idx = 0; idx < max_queue_size; idx++) {
            if (block_queue.size() < idx) {
                continue;
            }

            Block block = blockGenerator.generate_block();
            block_queue.add(block);
        }
    }

    public void on_frame_update() {
        apply_gravity();
        if (check_on_top(this.current_block)) {
            place_block();
            next_block();
        }

        clear_filled_rows();
    }

    
    // Mechanics
    public void clear_filled_rows() {
        ArrayList<Integer> to_clear = new ArrayList<Integer>();

        for (int y = 0; y < this.size_y; y++) {
            int filled_positions = 0;
            for (int x = 0; x < this.size_x; x++) {
                if (this.game_grid[y][x] == 1) {
                    filled_positions += 1;
                }
            }
            if (filled_positions == this.size_x) {
                to_clear.add(y);
            }
        }

        int min_descend_row = 0;
        for (int row : to_clear) {
            for (int x = 0; x < this.size_x; x++) {
                // Remove tile
                this.game_grid[row][x] = 0;
            }
            if (row > min_descend_row) {
                min_descend_row = row;
            }
        }
        if (to_clear.isEmpty()) {
            return;
        }

        int go_down = to_clear.size();
        for (int y = min_descend_row - 1; y >= 0; y--) {
            if (y == this.size_y - 1) {
                continue;
            }

            for (int x = 0; x < this.size_x; x++) {
                 if (this.game_grid[y][x] == 1) {
                    this.game_grid[y + go_down][x] = 1;
                    this.game_grid[y][x] = 0;
                }
            }
        }
    }
    
    public void apply_gravity() {
        current_gravity += tile_per_frame;
        if (current_gravity >= 1) {
            // Move block down
            move_block(1);
            current_gravity = 0;
        }
    }

    public void next_block() {
        this.current_block = this.block_queue.get(0);
        this.block_queue.remove(0);
        gen_block_queue();
        changed = true;
    }

    // Returns true if the block could be moved
    public boolean move_block(int direction_idx) {
        int[] direction = DIRECTIONS[direction_idx];
        
        for (int[] pos : this.current_block.get_positions()) {
            int[] new_pos = {pos[0] + direction[0], pos[1] + direction[1]};
            // System.out.println("New position: " + new_pos[0] + " " + new_pos[1]);
            if (!check_inside_bounds(new_pos) || !check_pos_available(new_pos)) {
                return false;
            }
        }

        this.current_block.pos[0] = this.current_block.pos[0] + direction[0];
        this.current_block.pos[1] = this.current_block.pos[1] + direction[1];

        // update_console();

        changed = true;

        return true;
    }

    public void set_current_block(Block block) {
        if (this.current_block != null) {
            return;
        }

        this.current_block = block;
    }

    public boolean place_block() {
        if (fix_block(this.current_block)) {
            this.current_block = null;
            changed = true;
            return true;
        }
        

        return false;
    }

    public boolean rotate_block(boolean counter_clockwise) {
        if (!counter_clockwise) {
            this.current_block.rotate();
        } else {
            this.current_block.unrotate();
        }
        
        if (!validate_block(this.current_block, null)) {
            if (!counter_clockwise) {
                this.current_block.unrotate();
            } else {
                this.current_block.rotate();
            }
        }

        // update_console();
        changed = true;

        return true;
    }

    // Returns true if the block was placed
    private boolean fix_block(Block block) {
        int[][] positions = block.get_positions();
        for (int[] pos : positions) {
            if (!check_pos_available(pos)) {
                return false;
            }

            if (!check_inside_bounds(pos)) {
                return false;
            }
        }

        for (int idx = 0; idx < positions.length; idx++) {
            // Set the position to 1
            set_pos(positions[idx][0],
                    positions[idx][1], 1);
        }

        return true;
    }

    private void set_pos(int pos_x, int pos_y, int value) {
        this.game_grid[pos_y][pos_x] = value;

    }

    public boolean validate_block(Block block, int[] direction) {
        if (direction == null) {
            direction = new int[2];
            direction[0] = 0;
            direction[1] = 0;
        }
        for (int[] pos : block.get_positions()) {
            int[] new_pos = {pos[0] + direction[0], pos[1] + direction[1]};
            if (!check_inside_bounds(new_pos) || !check_pos_available(new_pos)) {
                return false;
            }
        }

        return true;
    }

    public boolean check_on_top(Block block) {
        for (int[] pos : block.get_positions()) {
            // Check if it is on the bottom of the map
            if (check_bottom(pos)) {
                return true;
            }

            int[] pos_below = {pos[0], pos[1] + 1};
            if (!check_pos_available(pos_below)) {
                // Variable used to determine if the block should be placed
                // on next idle frame (frame without any actions)
                return true;
            }
        }

        return false;
    }

    public boolean check_pos_available(int[] pos) {
        return this.game_grid[pos[1]][pos[0]] == 0;
    }

    public boolean check_inside_bounds(int[] pos) {
        if (pos[0] >= this.size_x || pos[1] >= this.size_y) {
            return false;
        } 

        if (pos[0] < 0 || pos[1] < 0) {
            return false;
        }

        return true;
    }

    public boolean check_bottom(int[] pos) {
        return pos[1] >= this.size_y - 1;
    }


    public void update_console() {
        clear_console();
        System.out.println(get_ui_string());
        changed = false;
    }

    public String get_ui_string() {
        // Top bar
        String ui = "+";
        for (int idx = 0; idx < this.size_x; idx++) {
            ui += "___";
        }
        ui += "+\n";

        ui += get_board_string();

        // Bottom row
        ui += "+";
        for (int idx = 0; idx < this.size_x; idx++) {
            ui += "___";
        }
        ui += "+\n\n";

        ui += get_block_queue_string();

        return ui;
    }

    private String get_board_string() {
        int[][] board = new int[this.size_y][this.size_x];
        for (int y = 0; y < this.size_y; y++) {
            for (int x = 0; x < this.size_x; x++) {
                board[y][x] = this.game_grid[y][x];
            }
        }

        for (int[] pos : this.current_block.get_positions()) {
            board[pos[1]][pos[0]] = 1;
        }

        // Create game grid rows
        String[] rows = new String[this.size_y];
        for (int y = 0; y < this.size_y; y++) {
            String row_string = "";
            for (int x = 0; x < this.size_x; x++) {
                String tile = board[y][x] == 0 ? " " : "O";
                row_string += " " + tile + " ";
            }
            // ui += row_string + "\n";
            rows[y] = row_string;
        }

        String board_string = "";
        for (int idx = 0; idx < this.size_y; idx++) {
            board_string += "|" + rows[idx] + "|\n";
        } 

        return board_string;
    }

    private String get_block_queue_string() {
        String queue_str = "";

        // String[][] str_grid = new String[Block.MAX_SIZE][Block.MAX_SIZE * max_queue_size];
        // for (int y = 0; y < Block.MAX_SIZE; y++) {
        //     for (int x = 0; x < Block.MAX_SIZE * max_queue_size; x++) {
        //         str_grid[y][x] = " ";
        //     }
        // }


        String[][][] shape_grids = new String[max_queue_size][][];
        for (int block_idx = 0; block_idx < max_queue_size; block_idx++) {
            int[][] shape = this.block_queue.get(block_idx).get_shape();
            
            String[][] str_grid = new String[Block.MAX_SIZE][Block.MAX_SIZE];

            for (int y = 0; y < Block.MAX_SIZE; y++) {
                for (int x = 0; x < Block.MAX_SIZE; x++) {
                    str_grid[y][x] = shape[y][x] == 1 ? " O " : "   ";
                }
            }
            shape_grids[block_idx] = str_grid;
        }
        

        for (int row = 0; row < Block.MAX_SIZE; row++) {
            String row_str = "";
            for (int block_idx = 0; block_idx < max_queue_size; block_idx++) {
                String block_row = block_idx == 0 ? "|" : "";
                for (int x = 0; x < Block.MAX_SIZE; x++) {
                    block_row += shape_grids[block_idx][row][x];
                }

                row_str += block_row + "|";
            }
            queue_str += row_str + "\n";
        }

        return queue_str;
    }

    private void clear_console() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    // Insert block
    // Move current block
}
