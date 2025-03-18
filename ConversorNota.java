import java.util.Scanner;

public class ConversorNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota do aluno: ");
        double nota = input.nextDouble();
        input.close();

        String nota_convertida = "";

        if (nota <= 2) {
            nota_convertida = "I";
        } else {
            if (nota <= 5) {
                nota_convertida = "R";
            } else {
                if (nota <= 7) {
                    nota_convertida = "B";
                } else {
                    if (nota <= 9) {
                        nota_convertida = "MB";
                    } else {
                        nota_convertida = "E";
                    }
                }
            }
        }

        System.out.println("A nota convertida é: " + nota_convertida);
    }
}
