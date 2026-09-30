public class For {
    public static void main(String[] args) {
        // for loop
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // prints even numbers
        for(int i = 0; i < 10; i += 2){
            System.out.println(i);
        }

        // nest loop
        for (int i = 0; i < 10; i++){
            System.out.println("Outer loop: " + i);

            for(int j = 0; j < 10; j++){
                System.out.println("Inner loop: " + j);
            }
        }

        // for each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }
    }
}