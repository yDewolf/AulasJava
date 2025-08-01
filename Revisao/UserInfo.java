import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.next();
        input.close();

        System.out.println(nome + " " + sobrenome);
    }
}
