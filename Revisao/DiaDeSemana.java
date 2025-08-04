import java.util.Scanner;

public class DiaDeSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um dia de 1 a 7: ");
        int dia = input.nextInt();
        input.close();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado-Feira");
                break;

            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
