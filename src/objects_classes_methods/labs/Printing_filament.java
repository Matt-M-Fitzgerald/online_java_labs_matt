package objects_classes_methods.labs;

public class Printing_filament extends ThreeDPrinter {

    static String material;
    static String color;
    static int    diameter;

    @Override
    public String toString() {
        return "Printing Filament{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", diameter='" + diameter + '\'' +
                '}';
    }
}

