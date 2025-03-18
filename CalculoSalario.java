import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        double salario = input.nextDouble();
        input.close();

        double salario_liquido = calcularImposto(salario);

        System.out.println("Seu salário líquido será: " + salario_liquido);
    }

    private static double calcularImposto(double salario) {        
        if (salario > 4665) {
            return salario - (salario * 27.5 / 100);
        }

        if (salario > 3752) {
            return salario - (salario * 22.5 / 100);
        }

        if (salario > 2826) {
            return salario - (salario * 15 / 100);
        }

        if (salario > 2112) {
            return salario - (salario * 7.5 / 100);
        }

        return salario;
    }
}
