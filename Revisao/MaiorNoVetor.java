
public class MaiorNoVetor {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        System.out.print("\n[");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i]);
            if (i < 10) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        int maior = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maior) {
                maior = nums[i];
            }
        }
        System.out.println("O Maior número no vetor é: " + maior);
    }
}
