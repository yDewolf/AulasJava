package Exercicios2.Condicionais;

import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float num1 = input.nextFloat();
        input.close();

        String message = num1 % 5 == 0 ? "O número é múltiplo de 5" : "O número não é múltiplo de 5";

        System.out.println(message);
    }
}