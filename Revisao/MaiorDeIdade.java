import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        int value = input.nextInt();
        input.close();
        if (value >= 18) {
            System.out.println("Maior de idade");
            return;
        }
        System.out.println("Menor de idade");
    }
}
