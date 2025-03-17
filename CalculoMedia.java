import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();
        
        double media = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Informe a " + i + "ª Nota: ");
            int nota = input.nextInt();
            media += nota;
        }
        media /= 3;

        System.out.println("A média do aluno é: " + media);
    }
}
