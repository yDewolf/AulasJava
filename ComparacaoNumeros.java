import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = input.nextDouble();
        
        System.out.println("Informe o segundo número: ");
        double num2 = input.nextDouble();
        input.close();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
}