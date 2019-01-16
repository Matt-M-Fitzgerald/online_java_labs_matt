package objects_classes_methods.labs;

import java.util.Scanner;

/**
 * Objects, Classes and Methods Exercise 4:
 * <p>
 * Demonstrate method overloading with at least three overloaded methods.
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Multi mult = new Multi();
        int product = mult.multiplication(5, 10);
        System.out.println(product);
        double productTwo = mult.multiplication(10.54, 16.87);
        System.out.println(productTwo);
        float productThree = mult.multiplication(1, 0);
        System.out.println(productThree);


        Multi.methodExample();

    }

}

class Multi {

    //Establishing first method to be overloaded
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    //Overload method1
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    //Overload method2
    public float multiplication(float num1, float num2) {
        return num1 * num2;
    }

    public static void methodExample() {
        System.out.println("hi");
    }

}




