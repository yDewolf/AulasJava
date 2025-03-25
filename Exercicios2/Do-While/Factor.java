import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        int i = 1;
        int factor = 1;
        do {
            factor *= i;
            System.out.println(factor);
            i++;
        }
        while (i <= num1);

        System.out.println(num1 + "! = " + factor);
    }
}
