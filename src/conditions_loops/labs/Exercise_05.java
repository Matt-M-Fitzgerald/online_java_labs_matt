package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a lower bound: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        //second bound
        Scanner scanner2 = new Scanner(System.in);
        //Ask
        System.out.print("Enter an upper bound:");
        //assign
        int numberTwo = scanner2.nextInt();
        int num = number;

        for (int i = number; i <=numberTwo  ; i++) {


                 num += i;


        }
        System.out.println("The sum is:" + num);


                double ave;
                ave = (number + numberTwo / 2);

                System.out.println("The average of the two bounds is:" + ave);

        }
    }






