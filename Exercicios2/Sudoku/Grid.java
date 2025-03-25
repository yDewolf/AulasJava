package Exercicios2.Sudoku;

import java.util.Arrays;
import java.util.Random;

public class Grid {
    public int size_x;
    public int size_y;

    public int[][] values;

    public Grid(int size_x, int size_y, int max_fill) {
        this.size_x = size_x;
        this.size_y = size_y;

        this.values = new int[size_y][size_x];
        fill_randomly_rows(max_fill);
    }

    public void insert_value(int row_idx, int column_idx, int value) {
        this.values[row_idx][column_idx] = value;
    }

    public void remove_value(int row_idx, int column_idx) {
        this.values[row_idx][column_idx] = 0;
    }

    // Checks if a row is valid
    public boolean check_row(int row_idx, int values[][], boolean check_win) {
        int[] numbers = new int[this.size_x];
        for (int i = 0; i < this.size_x; i++) {
            // Check if there is position without a value
            if (this.values[row_idx][i] == 0 && check_win) {
                return false;
            } 

            if (Arrays.asList(numbers).contains(values[row_idx][i])) {
                return false;
            }

            if (this.values[row_idx][i] == 0) {
                continue;
            }
            
            numbers[i] = this.values[row_idx][i];
        }

        return true;
    }

    // Checks if a column is valid
    public boolean check_column(int column_idx, int values[][], boolean check_win) {
        int[] numbers = new int[this.size_y];
        for (int i = 0; i < this.size_y; i++) {
            // Check if there is position without a value
            if (this.values[i][column_idx] == 0 && check_win) {
                return false;
            } 

            if (Arrays.asList(numbers).contains(values[i][column_idx])) {
                return false;
            }
            
            if (this.values[i][column_idx] == 0) {
                continue;
            }

            numbers[i] = this.values[i][column_idx];
        }

        return true;
    }

    public boolean check_position_correct(int x_pos, int y_pos, int value) {
        int[][] check_values = new int[this.size_y][this.size_x];
        for (int y = 0; y < this.size_y; y++) {
            for (int x = 0; x < this.size_x; x++) {
                check_values[x][y] = this.values[x][y];
            }
        }

        
        check_values[x_pos][y_pos] = value;

        return check_row(y_pos, check_values, false) && check_column(x_pos, check_values, false);
    }

    private void fill_randomly_rows(int max) {
        Random rng = new Random();
        for (int row_idx = 0; row_idx < this.size_y; row_idx++) {
            int[] already_in = new int[this.size_x];

            for (int i = 0; i < max; i++) {
                int num = 0;
                do  {
                    num = rng.nextInt(1, this.size_x); // Randi range from 0 to normally 9
                }
                while (Arrays.asList(already_in).contains(num));

                int column_idx = 0;
                do {
                    column_idx = rng.nextInt(1, this.size_x);
                } 
                while (!check_position_correct(column_idx, row_idx, num));

                insert_value(row_idx, column_idx, num);
                already_in[column_idx] = num;
            }
        } 
    }


    public String stringify() {
        String stringified = "";
        for (int y = 0; y < this.size_y; y++) {
            for (int x = 0; x < this.size_x; x++) {
                stringified += " " + this.values[x][y] + " ";
            }

            stringified += "\n";
        }

        return stringified;
    }
}
