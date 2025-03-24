import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();
        System.out.println("Informe o segundo número: ");
        float num2 = input.nextFloat();
        input.close();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}