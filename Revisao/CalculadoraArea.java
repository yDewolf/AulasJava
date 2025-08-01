import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor em reias: ");
        int value = input.nextInt();
        System.out.println("Informe a cotação do dólar: ");
        int cot = input.nextInt();
        int result = value * cot;

        input.close();
        System.out.println("O valor em dólares é: " + result);
    
    }   
}
