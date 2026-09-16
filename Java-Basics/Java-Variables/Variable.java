public class Variable{
    public static void main(String[] args) {
        String myText = "Hello World"; // String is a datatype
        final int myNum = 9; // final means the value cannot be changed
        String myName = "John";
        int x = 5;
        int y = 6;
        System.out.println(myText);
        System.out.println(myNum);
        System.out.println("Hello "+myName); // concatenation
        System.out.println("The sum is: "+x+y); // The sum is: 56
        System.out.println("The sum is: "+(x+y)); // The sum is: 11
    }
}