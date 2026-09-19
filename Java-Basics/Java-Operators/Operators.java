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

        // Comparison Operators
        int d = 10;
        int e = 5;
        System.out.println("Equal to: " + (d == e)); // Equal to
        System.out.println("Not equal to: " + (d != e)); // Not equal to
        System.out.println("Greater than: " + (d > e)); // Greater than
        System.out.println("Less than: " + (d < e)); // Less than
        System.out.println("Greater than or equal to: " + (d >= e)); // Greater than or equal to
        System.out.println("Less than or equal to: " + (d <= e)); // Less than or equal to

        // Logical Operators
        boolean f = true;
        boolean g = false;
        System.out.println("AND: " + (f && g)); // AND
        System.out.println("OR: " + (f || g)); // OR
        System.out.println("NOT: " + (!f)); // NOT
    }
}