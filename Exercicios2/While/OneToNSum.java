package Exercicios2.While;
import java.util.Scanner;

public class OneToNSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        int i = 0;
        int sum = 0;
        while (i <= num1) {
            sum += i;
            System.out.println(sum);
            i++;
        }

        System.out.println("A soma total é: " + sum);
    }
}
