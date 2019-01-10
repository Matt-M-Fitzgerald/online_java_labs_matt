package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */


public class Exercise_03 {

    public static void main(String[] args) {
        //Set up scanner for name
        Scanner scanner = new Scanner(System.in);
        //Ask
        System.out.print("Enter your name:");
        //assign
        String name = scanner.next();
        //displaying name
        System.out.println("This is your name:" + name);

        //creating pig latin
        System.out.print("This is your name in pig latin:" + name.substring(name.length() - (name.length()-1)));
        System.out.print(""+ name.substring(0,1));
        System.out.println("ay");

    }
}


