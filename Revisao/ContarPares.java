
public class ContarPares {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        System.out.print("\n[");
        int total_par = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (nums[i] % 2 == 0) {
                total_par++;
            }
            if (i < nums.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("Total pares: " + total_par);
    }
}
