public class Operators{
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b)); // Integer addition
        System.out.println("Subtraction: " + (a - b)); // Integer subtraction
        System.out.println("Multiplication: " + (a * b)); // Integer multiplication
        System.out.println("Division: " + (a / b)); // Integer division
        System.out.println("Modulus: " + (a % b)); // Remainder
        System.out.println("Increment: " + (++a)); // Pre-increment
        System.out.println("Decrement: " + (--a)); // Pre-decrement

        // Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        c -= 5; // c = c - 5
        c *= 5; // c = c * 5
        c /= 5; // c = c / 5
        c %= 5; // c = c % 5
        c &= 5; // c = c & 5
        c |= 5; // c = c | 5
        c ^= 5; // c = c ^ 5
        c >>= 5; // c = c >> 5
        c <<= 5; // c = c << 5
    }
}