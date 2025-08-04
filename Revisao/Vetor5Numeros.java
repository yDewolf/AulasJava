import java.util.Scanner;

public class Vetor5Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Informe o " + i + " Valor: ");
            nums[i] = input.nextInt();
        }
        input.close();

        System.out.print("\n[");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i < nums.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
