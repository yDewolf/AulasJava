import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o número a ser fatorado: ");
        int num = input.nextInt();
        input.close();

        int fatorial = 1; 

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println(num + "! = " + fatorial);
    }
}
