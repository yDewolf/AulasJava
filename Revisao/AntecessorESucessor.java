import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int n = input.nextInt();
        
        input.close();
        System.out.println("Seu antecessor é: " + (n - 1) + " E seu sucessor é: " + (n + 1));
    }
}
