package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number to determine the day of the week: ");
        // assign input to variable as int
        int number = scanner.nextInt();
        if (number <= 100){
            if (number == 1) {
                System.out.println("The number corresponds to Monday");
            }
        if (number == 2) {
            System.out.println("The number corresponds to Tuesday");
        }
        if (number == 3) {
            System.out.println("The number corresponds to Wednesday");
        }
        if (number == 4) {
            System.out.println("The number corresponds to Thursday");
        }
        if (number == 5) {
            System.out.println("The number corresponds to Friday");
        }
        if (number == 6) {
            System.out.println("The number corresponds to Saturday");
        }
        if (number == 7) {
            System.out.println("The number corresponds to Sunday");
        }
        if (number >= 8){
            System.out.println("There is no corresponding day of the week");}

    }

        }

    }

