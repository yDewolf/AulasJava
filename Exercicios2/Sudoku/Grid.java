package Exercicios2.Sudoku;

public class Grid {
    public int size_x;
    public int size_y;

    public int[][] values;

    public Grid(int size_x, int size_y) {
        this.size_x = size_x;
        this.size_y = size_y;

        this.values = new int[size_y][size_x];
    }

    public void insert_value(int row_idx, int column_idx, int value) {
        this.values[row_idx][column_idx] = value;
    }

    public void remove_value(int row_idx, int column_idx) {
        this.values[row_idx][column_idx] = 0;
    }

    // Check if the row sums up to the correct value
    public boolean check_row(int row_idx) {
        int sum = 0;        
        for (int i = 0; i < this.size_x; i++) {
            // Check if there is position without a value
            if (this.values[row_idx][i] == 0) {
                return false;
            } 
            sum += this.values[row_idx][i];
        }

        return sum == sum_to(this.size_x);
    }

    // Check if the column sums up to the correct value
    public boolean check_column(int column_idx) {
        int sum = 0;        
        for (int i = 0; i < this.size_x; i++) {
            // Check if there is position without a value
            if (this.values[i][column_idx] == 0) {
                return false;
            } 
            sum += this.values[i][column_idx];
        }

        return sum == sum_to(this.size_x);
    }

    private int sum_to(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}
