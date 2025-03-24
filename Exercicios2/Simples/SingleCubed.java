import java.util.Scanner;

public class SingleCubed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();
        input.close();

        System.out.println(num1 + "³ " + " = " + (num1 * num1 * num1));
    }
}
