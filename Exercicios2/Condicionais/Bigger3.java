import java.util.Scanner;

public class Bigger3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();

        System.out.println("Informe o segundo número: ");
        float num2 = input.nextFloat();

        System.out.println("Informe o terceiro número: ");
        float num3 = input.nextFloat();
        input.close();

        float bigger = num1 > num2 ? num1 : num2;
        bigger = num3 > bigger ? num3 : bigger;

        System.out.println("O maior número é: " + bigger);
    }
}
