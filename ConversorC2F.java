
import java.util.Scanner;

public class ConversorC2F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em °C");
        double temp_c = input.nextDouble();
        input.close();
        
        System.out.println("Temperatura em Farenheit: " + ((temp_c * 9 / 5) + 32));
    }
}