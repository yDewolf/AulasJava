package Exercicios2.Sudoku;

import java.util.Random;

public class Sudoku {
    public static void main(String[] args) {
        int[] grid = create_grid(false, 3);
        System.out.println(stringify_grid(grid, 3, 3));
    }  

    private static void put_random_row(int[] grid, int row_idx) {
        
    }

    private static int[] create_grid(boolean random, int amount) {
        Random rng = new Random();
        int[] single_grid = new int[9];    

        for (int i = 0; i < amount; i++) {
            int num = rng.nextInt(0, 9);
            int idx = rng.nextInt(0, 9);
            single_grid[idx] = num;
        }

        return single_grid;
    }

    private static String stringify_grid(int[] grid, int y_size, int x_size) {
        String stringified = "";
        for (int y = 0; y < y_size; y++) {
            for (int x = 0; x < x_size; x++) {
                stringified += " " + grid[(y * 3) + x] + " ";
            }

            stringified += "\n";
        }

        return stringified;
    }
}
