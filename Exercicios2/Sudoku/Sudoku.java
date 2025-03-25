package Exercicios2.Sudoku;
import Exercicios2.Sudoku.Grid;

import java.util.Random;

public class Sudoku {
    public static void main(String[] args) {
        Grid grid = new Grid(3, 3, 1);
        System.out.println(grid.stringify());

        // int[] grid = create_grid(false, 3);
        // System.out.println(stringify_grid(grid, 3, 3));
    }  
}
