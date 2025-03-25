package Exercicios2.Condicionais;

import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float num1 = input.nextFloat();
        input.close();

        String message = num1 > 0 ? "O número é positivo" : "O número é negativo";
        if (num1 == 0) {
            message = "Zero é nulo!";
        }

        System.out.println(message);
    }
}