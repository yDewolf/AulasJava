import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe sua idade");
        int idade = input.nextInt();
        input.close();

        if (idade >= 18) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }
    }
}
