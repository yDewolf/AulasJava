import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = input.nextInt();
        input.close();

        int total = 0;
        for (int i = 2; i <= num; i++) {
            total += i * total;
        }
        System.out.println(num + "! = " + total);
    }
}
