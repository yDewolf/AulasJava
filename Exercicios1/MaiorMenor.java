import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = input.nextDouble();
    
        
        System.out.println("Informe o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double num3 = input.nextDouble();

        input.close();

        double maior = num1;
        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número entre " + num1 + ", " + num2 + " e " + num3 + " é " + maior);
    }
}