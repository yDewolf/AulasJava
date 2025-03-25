package Exercicios2.Condicionais;

import java.util.Scanner;

public class Between10And20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float num1 = input.nextFloat();
        input.close();

        boolean is_between = num1 > 10 && num1 < 20;
        if (is_between) {
            System.out.println("O número não está fora do intervalo de 10 a 20");
        } else {
            System.out.println("O número está dentro do intervalo de 10 a 20");
        }
    }
}
