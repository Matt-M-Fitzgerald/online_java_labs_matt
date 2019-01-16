package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 * <p>
 * Using the array below, take in a number from 1-10 from the user and print out the index of that
 * element.
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // finding index of a user input
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 10: ");
        // assign input to variable as int

        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("The number you chose is position: " + i);
            }
        }

    }
}