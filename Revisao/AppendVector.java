public class AppendVector {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        System.out.print("\nVetor 1:\n[");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i <= nums.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        int[] nums2 = new int[5];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = (int) (Math.random() * 100);
        }

        System.out.print("\nVetor 2:\n[");
        for (int i = nums2.length - 1; i >= 0; i--) {
            System.out.print(nums2[i]);
            if (i <= nums2.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        int[] nums3 = new int[nums.length + nums2.length];
        for (int i = 0; i < nums3.length; i++) {
            if (i >= nums.length) {
                nums3[i] = nums2[i - nums.length];
                continue; 
            }
            nums3[i] = nums[i];
        }

        System.out.print("\nVetor 1 + Vetor 2:\n[");
        for (int i = nums3.length - 1; i >= 0; i--) {
            System.out.print(nums3[i]);
            if (i <= nums3.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
