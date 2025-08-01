import java.util.Scanner;

public class DobroETriplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor em reias: ");
        int value = input.nextInt();
        input.close();

        System.out.println("O dobro de " + value + " é: " + (value * 2) + " E o triplo é: " + (value * 3));
    }
}
