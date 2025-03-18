import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um ano: ");
        int year = input.nextInt();
        input.close();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("O ano não é bissexto");
                }

            } else {
                System.out.println("O ano é bissexto");
            } 

        } else {
            System.out.println("O ano não é bissexto");
        }
    }
}
