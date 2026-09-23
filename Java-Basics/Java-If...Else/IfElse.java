public class IfElse{
    public static void main(String[] args) {
        // Using boolean variable
        boolean isRaining = true;
        if(isRaining){
            System.out.println("Take an umbrella"); 
        }

        // If without curly braces
        if (20 > 18)
            System.out.println("20 is greater than 18"); 

        // Using else
        int age = 22;
        if (age > 18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}