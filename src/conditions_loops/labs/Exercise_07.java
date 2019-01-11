package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        //Set up scanner for word
        Scanner scanner = new Scanner(System.in);
        //Ask
        System.out.print("Enter a word:");
        //assign
        String word = scanner.next();

        int l = word.length();
        System.out.println("Length:" + l);
        int i = 0;
        boolean shouldContinue = true;

        while (shouldContinue == true) {

            if (word.charAt(i) == 'a') {
                System.out.println("The First vowel was:" + "a");
                shouldContinue = false;
            }
            if (word.charAt(i) == 'e') {
                System.out.println("The First vowel was:" + "e");
                shouldContinue = false;
            }
            if (word.charAt(i) == 'i') {
                System.out.println("The First vowel was:" + "i");
                shouldContinue = false;
            }
            if (word.charAt(i) == 'o') {
                System.out.println("The First vowel was:" + "o");
                shouldContinue = false;
            }
            if (word.charAt(i) == 'u') {
                System.out.println("The First vowel was:" + "u");
                shouldContinue = false;
            }
            i++;

        }

            System.out.println("Your word was:" + word);
    }

}




