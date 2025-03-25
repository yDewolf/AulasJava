package src;

import java.util.ArrayList;

public class TetrisGame {
    private ArrayList<Block> block_queue = new ArrayList<Block>();
    private BlockGenerator blockGenerator = new BlockGenerator();
    private int max_queue_size = 1;

    
    private int size_x = 10;
    private int size_y = 24;
    private int[][] game_grid = new int[24][10];

    private Block current_block;
    // DirectionsEnum.java
    private static int[][] DIRECTIONS = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public TetrisGame() {
        gen_block_queue();
        this.current_block = blockGenerator.generate_block();
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

    // Mechanics

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
        System.out.println(current_block.pos[0] + " " + current_block.pos[1]);

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
            return true;
        }

        return false;
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
            set_pos(positions[idx][1],
                    positions[idx][0], 1);
        }

        return true;
    }

    private void set_pos(int pos_x, int pos_y, int value) {
        this.game_grid[pos_y][pos_x] = value;

    }

    public boolean check_pos_available(int[] pos) {
        return this.game_grid[pos[1]][pos[0]] == 0;
    }
    
    public boolean check_inside_bounds(int[] pos) {
        if (pos[0] > this.size_x || pos[1] > this.size_y) {
            return false;
        } 

        if (pos[0] < 0 || pos[1] < 0) {
            return false;
        }

        return true;
    }
    // Insert block
    // Move current block
}
