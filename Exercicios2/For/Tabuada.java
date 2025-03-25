package Exercicios2.For;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num1 + " * " + i + " " + num1 * i);
        }
    }
}
