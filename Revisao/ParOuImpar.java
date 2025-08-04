import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int value = input.nextInt();
        input.close();
        if (value % 2 == 0) {
            System.out.println("O Valor é par");
            return;
        }
        System.out.println("O valor é ímpar");
    }
}
