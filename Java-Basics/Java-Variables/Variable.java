public class Variable{
    public static void main(String[] args) {
        String myText = "Hello World"; // String is a datatype
        final int myNum = 9; // final means the value cannot be changed
        String myName = "John";
        int x = 5;
        int y = 6;
        int a = 5, b = 6, c = 7; // declare multiple variables in one line
        int p, q, r;
        p = q = r = 10; // one value to multiple variables in one line
        System.out.println(myText);
        System.out.println(myNum);
        System.out.println("Hello "+myName); // concatenation
        System.out.println("The sum is: "+x+y); // The sum is: 56
        System.out.println("The sum is: "+(x+y)); // The sum is: 11
        System.out.println(a+b+c); // 18
        System.out.println(p+q+r); // 30

        // Calculate the area of a rectangle
        int length = 5;
        int width = 4;
        int area = length * width;
        System.out.println("The length is: "+length); // The length is: 5
        System.out.println("The width is: "+width); // The width is: 4
        System.out.println("The area is: "+area); // The area is: 20
    }
}