import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= num1);
    }
}
