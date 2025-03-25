import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        int i = 0;
        do {
            System.out.println(num1 + " * " + i + " = " + (num1 * i));
            i++;
        }
        while (i <= num1);
    }
}
