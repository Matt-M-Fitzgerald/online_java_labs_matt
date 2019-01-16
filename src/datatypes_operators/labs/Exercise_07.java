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
        for (int i = 0; i < 2; i++) {
            System.out.print(irrArray[0][i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            System.out.print(irrArray[1][i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            System.out.print(irrArray[2][i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            System.out.print(irrArray[3][i] + " ");
        }

    }
}

