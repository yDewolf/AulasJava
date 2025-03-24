import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        float factor = 1;
        for (int i = 1; i <= num1; i++) {
            factor *= i;
        }

        System.out.println(num1 + "! " + " = " + factor);
    }
}
