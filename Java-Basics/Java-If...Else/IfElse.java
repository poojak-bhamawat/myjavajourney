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

        // Using else if
        int day = 4;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }  else {
            System.out.println("Invalid day");
        }
    }
}