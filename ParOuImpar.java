import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num = input.nextInt();
        input.close();

        int resultado = num / 2;
        int resto = resultado * 2 - num;

        if (resto == 0) {
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é impar");
        }
    }
}
