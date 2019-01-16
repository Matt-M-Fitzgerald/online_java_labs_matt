package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 * <p>
 * Create at least three example classes (class1, class2, class3) that demonstrate comfort
 * in creating multiple classes with multiple methods, and then call between those methods across classes.
 * These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 * 1) Class1 should have the main method.
 * 2) The main method then needs to create an object of class1, class2, class3.
 * 3) The main method should then  call one or more non-static methods in class2 and class3.
 */
public class Exercise_03 {

    public static void main(String[] args) {

        Exercise_03 newObject = new Exercise_03();
        newObject.method2class2();

        Exercise_03 newObject2 = new Exercise_03();
        newObject2.method2class3();

        Class2 newObject3 = new Class2();
        newObject3.methodNew();

        Class3 thingone = new Class3();
        thingone.methodClass3();

    }

    public void method2class2() {

        int num2 = 10;

        String obj = "This is an object from class2";
        System.out.println(obj);

        System.out.println("This is the value from class2: " + num2);


    }

    public void method2class3() {

        int num3 = 150;

        String obj2 = "This is an object from class3";
        System.out.println(obj2);

        System.out.println("This is the value from class3: " + num3);
    }
}

class Class2 {

    public void methodNew() {
        System.out.println("Calling a method from Class2 ");
    }


}

class Class3 {

    public void methodClass3() {

        String thing1 = "Putting together";
        String thing2 = " a sentence ";
        String thing3 = "to display.";

        System.out.print(thing1);
        System.out.print(thing2);
        System.out.println(thing3);
    }
}









