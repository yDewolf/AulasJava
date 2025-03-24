import java.util.Scanner;

public class TwoSumBiggerThan100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();
        System.out.println("Informe o segundo número: ");
        float num2 = input.nextFloat();
        input.close();

        String message = num1 + num2 > 100 ? "A soma é maior que 100" : "A soma não é maior que 100";
        System.out.println(message);
    }
}