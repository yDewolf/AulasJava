import java.util.Scanner;

public class SingleAbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float num1 = input.nextFloat();
        input.close();

        float abs = num1;
        if (num1 < 0) {
            abs = num1 * -1;
        }

        System.out.println("|" + num1 + "| " + " = " + abs);
    }
}
