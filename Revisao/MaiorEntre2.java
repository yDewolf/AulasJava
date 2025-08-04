import java.util.Scanner;

public class MaiorEntre2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int value = input.nextInt();
        System.out.println("Informe segundo número: ");
        int value2 = input.nextInt();

        input.close();
        if (value > value2) {
            System.out.println(value + " é o maior");
            return;
        }
        System.out.println(value2 + " é o maior");
    }
}
