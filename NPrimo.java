import java.util.Scanner;

public class NPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = input.nextInt();
        input.close();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("O número " + num + " não é primo");
                return;
            }
        }

        System.out.println("O número " + num + " é primo");
    }
}
