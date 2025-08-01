import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor da base: ");
        int base = input.nextInt();
        System.out.println("Informe o valor da altura: ");
        int altura = input.nextInt();
        int result = base * altura;

        input.close();
        System.out.println("A área do retângulo é: " + result);
    }
}
