import java.util.Scanner;

public class VerificadorTriangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamanho da base: ");
        double base = input.nextDouble();
    
        System.out.println("Informe o tamanho do lado A: ");
        double lado_A = input.nextDouble();
        
        System.out.println("Informe o tamanho do lado B: ");
        double lado_B = input.nextDouble();

        input.close();

        if (base == lado_A && lado_A == lado_B) {
            System.out.println("O triângulo é equilátero");
            return;
        }

        if (base != lado_A && lado_A == lado_B) {
            System.out.println("O triângulo é isósceles");
            return;
        }

        if (base != lado_A && lado_A != lado_B) {
            System.out.println("O triângulo é escaleno");
            return;
        }
    }
}
