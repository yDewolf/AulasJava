package Exercicios2.For;
import java.util.Scanner;

public class OneToNMultiple5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        for (int i = 1; i <= num1; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
