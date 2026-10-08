public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Access the element of an array
        System.out.println(cars[0]);

        // Change an element of an array
        cars[0] = "Opel";

        // Array length
        System.out.println(cars.length);

        // The new keyword
        String[] cars2 = new String[4];
        cars2[0] = "Volvo";
        cars2[1] = "BMW";
        cars2[2] = "Ford";
        cars2[3] = "Mazda";
        System.out.println(cars2[0]);

        // loop through an array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // loop through an array with for-each
        for (String i : cars) {
            System.out.println(i);
        }

        // Multidimensional arrays
        int[][] myNumbers = { {1, 2, 3}, {5, 6, 7} };

        // Access multidimensional array elements
        System.out.println(myNumbers[1][2]);

        // Change multidimensional array elements
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        // Rows and Columns(Lengths)
        System.out.println(myNumbers.length); // gives the number of rows
        System.out.println(myNumbers[0].length); // gives the number of columns

        // Loop through a multidimensional array
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}