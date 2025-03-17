import java.util.Scanner;

public class Exemplo01 {    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um número inteiro: ");
        
        int num = input.nextInt();
        input.close();
        
        if (num > 0 && num < 10) {
            System.out.println("Seu número está entre 1 e 9");
        } else {
            if (num <= 0 || num >= 10) {
                System.out.println("O número não está entre 1 e 9");
            }
        }
    }
}