package Exercicios2.Condicionais;

import java.util.Scanner;

public class OddOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float num1 = input.nextFloat();
        input.close();

        String message = num1 % 2 == 0 ? "O número é par" : "O número é impar";

        System.out.println(message);
    }
}