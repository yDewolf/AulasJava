import java.util.Scanner;

public class VerificacaoTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o comprimento do primeiro lado: ");
        double lado1 = input.nextDouble();
        
        System.out.println("Informe o comprimento do segundo lado: ");
        double lado2 = input.nextDouble();
        
        System.out.println("Informe o comprimento do segundo lado: ");
        double lado3 = input.nextDouble();
        input.close();
        
        if (lado1 + lado2 > lado3) {
            System.out.println("O Triangulo é válido");
            return;
        }

        if (lado1 + lado3 > lado2) {
            System.out.println("O Triangulo é válido");
            return;
        }

        if (lado2 + lado3 > lado1) {
            System.out.println("O Triangulo é válido");
            return;
        }

        System.err.println("O triangulo é inválido");
    }   
}
