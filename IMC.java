import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua altura (m): ");
        double altura = input.nextDouble();

        System.out.println("Informe seu peso (em Kg): ");
        double peso = input.nextDouble();
        input.close();

        double imc = peso / (altura * altura);
        if (imc > 40) {
            System.out.println("Obesidade grave");
        } else {
            if (imc >= 30) {
                System.out.println("Obesidade");
            } else {
                if (imc >= 25) {
                    System.out.println("Sobrepeso");
                } else {
                    if (imc >= 18.5) {
                        System.out.println("Normal");
                    } else {
                        System.out.println("Magreza");
                    }
                }
            }
        }
    }
}
