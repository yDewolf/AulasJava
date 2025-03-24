import java.util.Scanner;

public class SingleSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();
        input.close();

        System.out.println(num1 + "² " + " = " + (num1 * num1));
    }
}
