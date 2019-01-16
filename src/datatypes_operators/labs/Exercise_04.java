package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int[] vals = new int[10];
        for (int i = 0; i < 10; i++) {

            // create scanner
            Scanner scanner = new Scanner(System.in);
            // prompt user
            System.out.print("Enter a number: ");
            // assign input to variable as int

            int number = scanner.nextInt();
            vals[i] = number;

        }

        int num = vals[1];
        int ave = 0;
        for (int j = 0; j < 9; j++) {


            num += vals[j + 1];
            ave = num / 10;

        }

        System.out.println("The sum of the array is: " + num);
        System.out.println("The average of the array is: " + ave);


    }

}