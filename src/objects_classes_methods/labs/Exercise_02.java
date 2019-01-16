package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 * <p>
 * Create a class that demonstrates the following: (all methods below can be in the same class)
 * <p>
 * 1) A static method that calls another static method.
 * 2) A static method that calls a non-static method.
 * 3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 * 4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

public class Exercise_02 {

    //Answering 1
    public static void main(String[] args) {

        methodB();

        Exercise_02 sc = new Exercise_02();
        sc.nonStaticMethod();

        Exercise_02 ns2ns = new Exercise_02();
        ns2ns.method1();


        Exercise_02 ns2ns22 = new Exercise_02();
        ns2ns22.method12();
    }


    public static void methodB() {
        int a = 5;
        int b = 10;

        int sum = a * b;

        System.out.println(+sum);
    }

    //Answering 2
    public void nonStaticMethod(){
        System.out.println("This method is non-static and being called by a static method");
    }

    //Answering 3
    public void method1(){

        method2();

    }

    public void method2(){
         int num = 5;
        System.out.println("This value is returned from the non-static method: " + num);
    }

    //Answering 4
    public void method12(){

        Exercise_02 ns2ns2 = new Exercise_02();

        ns2ns2.method22(15);
    }

    public void method22(int num2){

        System.out.println("This value was passed from method12: " + num2);
    }
}












