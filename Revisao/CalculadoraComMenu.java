import java.util.Scanner;

public class CalculadoraComMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double value = input.nextDouble();
        
        System.out.println("Informe o outro número: ");
        double value2 = input.nextDouble();
        input.close();

        System.out.println("Informe a operação desejada: \n[1]-Somar\n[2]-Subtrair\n[3]-Multiplicar\n[4]-Dividir");
        int opt = input.nextInt();
        double result = 0.0;
        switch (opt) {
            case 1:
                result = value + value2;
                break;
            case 2:
                result = value - value2;
                break;
            case 3:
                result = value * value2;
                break;
            case 4:
                result = value / value2;
                break;

            default:
                System.out.println("Operação inválida");
                break;
        }

        System.out.println("Resultado: " + result);
    }   
}
