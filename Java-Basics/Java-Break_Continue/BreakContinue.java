public class BreakContinue {
    public static void main(String[] args) {
        // break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // Real World Example
        int [] numbers = {3,-1,7,0,9};
        for (int n : numbers) {
            if (n < 0) {
                continue;
            }
            if (n == 0) {
                break;
            }
            System.out.println(n);
        }
    }
}