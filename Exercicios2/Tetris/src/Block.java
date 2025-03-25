package src;

public class Block {
    private int type = -1;

    private int orientation = 0;
    private int[][] shape = new int[4][4];
    private int[][][] rotations;
    
    public int[] pos = new int[2];

    public Block(int[][][] rotations) {
        this.rotations = rotations;
        this.shape = this.rotations[this.orientation];
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
