import java.util.Scanner;

public class AprovacaoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount_nota = 2;
        int total = 0;
        for (int i = 0; i < amount_nota; i++) {
            System.out.println("Insira a " + i + "ª Nota: ");
            int nota = input.nextInt();
            total += nota;
        }
        input.close();
        
        double media = total / amount_nota;
        if (media >= 7.0) {
            System.out.println("O aluno passou");
            return;
        }

        if (media >= 5) {
            System.out.println("O aluno ficou de recuperação");
            return;
        }

        System.out.println("O Aluno reprovou");
    }
}
