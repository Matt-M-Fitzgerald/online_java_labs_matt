package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 * <p>
 * Create and populate an irregular array of size and contents of your choosing. Using a nested
 * "for-each" loop, iterate and print out each element of the array.
 */

public class Exercise_07 {
    public static void main(String[] args) {
        int[][] irrArray = {
                {0, 1},
                {0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0, 1}};

        for (int i = 0; i < 4; i++) {
            for (int z : irrArray[i]) {
                System.out.print(z + " ");
            }
            System.out.println(" ");
        }

    }

}


