package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class Exercise_05{
    public static void main(String[] args) {

        System.out.print(NewClass.str = "The static number from NewClass is: ");
        System.out.println(NewClass.num = 10);


        NewClass newObject = new NewClass();

        newObject.method1();

    }

}

class NewClass{

    static int num;
    static String str;

    public void method1(){
        String word1 = "This is word1 ";
        String word2 = "This is word2 ";
        int ns = 10;

        System.out.print(word1);
        System.out.print(word2);
        System.out.println(ns);
    }
}
