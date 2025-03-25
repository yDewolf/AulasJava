package Exercicios2.Condicionais;

import java.util.Scanner;

public class MultipleOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float num1 = input.nextFloat();
        input.close();

        String message = num1 % 3 == 0 ? "O número é múltiplo de 3" : "O número não é múltiplo de 3";

        System.out.println(message);
    }
}