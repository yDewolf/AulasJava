package src;

import java.util.ArrayList;

public class Block {
    // private int type = -1;

    public static int MAX_SIZE = 4;

    private int orientation = 0;
    private int[][] shape = new int[MAX_SIZE][MAX_SIZE];
    private int[][][] rotations;
    
    public int[] pos = new int[2];

    public Block(int[][][] rotations) {
        this.rotations = rotations;
        this.shape = this.rotations[this.orientation];
    }

    public int[][] get_shape() {
        return this.shape;
    }

    public int[][] get_positions() {
        ArrayList<int[]> to_insert = new ArrayList<int[]>();

        for (int pos_y = 0; pos_y < Block.MAX_SIZE; pos_y++) {
            for (int pos_x = 0; pos_x < Block.MAX_SIZE; pos_x++) {
                // Skip empty positions
                if (this.shape[pos_y][pos_x] == 0) {
                    continue;
                }

                int[] pos = {pos_x * this.pos[0], pos_y * this.pos[1]};

                to_insert.add(pos);
            }
        }

        int[][] positions = new int[to_insert.size()][2];
        for (int idx = 0; idx < positions.length; idx ++) {
            positions[idx] = to_insert.get(idx);
        }

        return positions;
    }

    public int[][] rotate() {
        this.orientation++;
        if (this.orientation >= this.rotations.length) {
            this.orientation = 1;
        }

        update_shape();

        return this.shape;
    }

    public int[][] unrotate() {
        this.orientation--;
        if (this.orientation < 0) {
            this.orientation = this.rotations.length - 1;
        }

        update_shape();

        return this.shape;
    }

    private void update_shape() {
        int[][] rotated_shape = this.rotations[this.orientation];
        this.shape = rotated_shape;
    }
}
