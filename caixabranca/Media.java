import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Informe quantas notas serão inseridas\n>> ");
        // int notasCount = input.nextInt();
        int notasCount = 2;
        double[] notasInseridas = new double[notasCount];
        double somaTotal = 0;
        for (int i = 0; i < notasCount; i++) {
            boolean successful = false;
            do {
                try {
                    System.out.println("Informe a " + (i + 1) + "ª nota");
                    notasInseridas[i] = input.nextFloat();
                    somaTotal += notasInseridas[i];
                    successful = true;
                } catch (Exception e) {
                    System.out.println("Erro na nota informada: " + e.toString() + "\nTente novamente...");
                }
            } while (!successful);
        }
        input.close();
        double media = somaTotal / notasCount;
        System.out.println("Média final: " + media);
        if (media < 3) {
            System.out.println("Aluno está reprovado");
        } else if (media < 6) {
            System.out.println("Aluno está de recuperação");
        } else {
            System.out.println("Aluno está aprovado");
        }
        System.out.println("Por favor diriga-se à secretaria da escola");
    }
}