package Exercicios2.While;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        int i = 0;
        while (i <= num1) {
            System.out.println(i);
            i++;
        }
    }
}
