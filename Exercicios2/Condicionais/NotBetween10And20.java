import java.util.Scanner;

public class NotBetween10And20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float num1 = input.nextFloat();
        input.close();

        boolean is_between = num1 > 10 && num1 < 20;
        if (is_between) {
            System.out.println("O número está entre 10 e 20");
        } else {
            System.out.println("O número não está entre 10 e 20");
        }
    }
}
