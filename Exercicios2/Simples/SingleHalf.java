import java.util.Scanner;

public class SingleHalf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();
        input.close();

        System.out.println(num1 + " / 2 " + " = " + (num1 / 2));
    }
}
