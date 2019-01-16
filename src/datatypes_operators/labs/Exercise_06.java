package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 * <p>
 * Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 * <p>
 * The output should look something like this:
 * <p>
 * 3 6 9 12 15
 * 18 21 24 27 30
 * ...
 * ...
 * ...
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];

        int num = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                num = num + 3;

                System.out.print(num + " ");


                twoDArray[j][i] = num;

            }
            System.out.println(" ");
        }
    }
}

