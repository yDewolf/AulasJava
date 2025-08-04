import java.util.Scanner;

public class ProcuraEmVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String[] NOMES = {
            "Davi",
            "André",
            "Duda",
            "Bea",
            "Guilherme",
            "Daniel",
            "Raquel",
            "Bruno",
            "Pedro",
            "Henrique",
            "Felipe"
        };
        System.out.println("Informe um nome à procurar: ");
        String nome = input.next().toLowerCase();
        input.close();
        for (String test_nome : NOMES) {
            if (test_nome.toLowerCase().equals(nome)) {
                System.out.println("Nome encontrado na lista");
                return;
            }
        }
        System.out.println("O nome não pôde ser encontrado");
    }
}
