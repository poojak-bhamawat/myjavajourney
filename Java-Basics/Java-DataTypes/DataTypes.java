public class DataTypes{
    public static void main(String[] args) {
        // Primitive Data Types
        byte myByte = 100;  // Byte value from -128 to 127
        short myShort = 5000; // Short value from -32,768 to 32,767
        int myInt = 5;               // Integer (whole number)
        long myLong = 15000000000L;    // Long value from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloatNum = 5.99f;  // Floating point number
        double myDoubleNum = 5.99d; // Floating point number
        char myLetter = 'D';       // Character
        boolean myBool = true;     // Boolean
        
        // Non-Primitive Data Types
        String myText = "Hello";   // String
        String[] cars = {"Volvo", "BMW", "Ford"}; // Array
        
        // var keyword
        var Var1 = 50; // myVar will be treated as an int
        var Var2 = 5.99; // myVar will be treated as a double
        var Var3 = "John"; // myVar will be treated as a String
        var Var4 = 'A'; // myVar will be treated as a char
        var Var5 = true; // myVar will be treated as a boolean
    }
}