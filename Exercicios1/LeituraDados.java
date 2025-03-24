import java.util.Scanner;

public class LeituraDados {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe sua idade");
        int idade = input.nextInt();

        System.out.println("Informe seu nome");
        String nome = input.next();
        input.close();

        String message = "";
        if (idade > 20) {
            message = "Nossa " + nome + ", você já está velhinho (a)";
        } else {
            message = "Bom dia " + nome + ", você ainda é novo (a)";
        }
        System.out.println(message);
    }
}