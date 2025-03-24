import java.util.Scanner;

public class FirstBigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();

        System.out.println("Informe o segundo número: ");
        float num2 = input.nextFloat();
        input.close();

        boolean is_bigger = num1 > num2;

        System.out.println("O primeiro número é maior? " + is_bigger);
    }
}
