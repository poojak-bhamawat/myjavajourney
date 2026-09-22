public class MAth{
    public static void main(String[] args) {
        // Math methods
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.min(10, 20));  // 10
        System.out.println(Math.sqrt(16));  // 4.0
        System.out.println(Math.abs(-16));  // 16
        System.out.println(Math.pow(2, 3));  // 8.0

        // Rounding methods
        System.out.println(Math.round(4.4));  // 4
        System.out.println(Math.round(4.6));  // 5
        System.out.println(Math.ceil(4.4));  // 5
        System.out.println(Math.floor(4.4));  // 4

        // Random numbers
        System.out.println(Math.random());  // 0.0 to 1.0
        System.out.println(Math.random() * 10);  // 0.0 to 10.0
        int randomNumber = (int) (Math.random() * 10);  // 0 to 9
        System.out.println(randomNumber);
    }
}