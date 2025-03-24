import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = input.nextInt();
        input.close();

        float sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
