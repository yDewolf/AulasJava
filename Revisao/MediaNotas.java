import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount_nota = 3;
        int total = 0;
        for (int i = 0; i < amount_nota; i++) {
            System.out.println("Insira a " + i + "ª Nota: ");
            int nota = input.nextInt();
            total += nota;
        }
        input.close();

        System.out.println("A média das notas é: " + total / amount_nota);
    }
}
