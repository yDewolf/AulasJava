
public class Sum {
    public static void main(String[] args) {
        int[] nums = new int[8];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        
        int total = 0;
        System.out.print("\n[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            total += nums[i];
            if (i <= nums.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
        System.out.println("Soma de todas as posições: " + total);
    }
}
