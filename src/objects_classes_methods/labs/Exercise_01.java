package objects_classes_methods.labs;

import sun.awt.windows.ThemeReader;

import java.awt.print.PrinterGraphics;
import java.util.PrimitiveIterator;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 *
 *
 */

// This class will be explaining a 3D printer
public class Exercise_01 {
    public static void main(String[] args) {

        ThreeDPrinter stratasys = new ThreeDPrinter();
        ThreeDPrinter.brand = "stratasys";
        ThreeDPrinter.model = "450MC";
        ThreeDPrinter.version = "one";

        System.out.println(stratasys.toString());

        ThreeDPrinter formlabs = new ThreeDPrinter();
        ThreeDPrinter.brand = "form labs";
        ThreeDPrinter.model = "form 2";
        ThreeDPrinter.version = "one";

        System.out.println(formlabs.toString());

        Printing_filament pla = new Printing_filament();
        Printing_filament.material = "pla";
        Printing_filament.diameter = 1;
        Printing_filament.color = "blue";

        System.out.println(pla.toString());

        Printing_filament abs = new Printing_filament();
        Printing_filament.material = "abs";
        Printing_filament.color = "red";
        Printing_filament.diameter = 5;

        System.out.println(abs.toString());

    }
}


