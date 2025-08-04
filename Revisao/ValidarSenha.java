import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String SENHA = "1234";
        while (true) {
            System.out.println("Digite a senha: ");
            String senha = input.next();
            if (senha == SENHA) {
                System.err.println("Senha correta");
                break;
            }
            System.out.println("Senha incorreta");
        }
        input.close();
    }
}
