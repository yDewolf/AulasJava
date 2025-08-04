public class SomaPar1A100 {
    public static void main(String[] args) {
        int i = 0;
        int total = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                continue;
            }
            total += i;
        }
        System.out.println(total);
    }
}