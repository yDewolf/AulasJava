import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float num1 = input.nextFloat();
        input.close();

        int i = 0;
        while (i < num1) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
