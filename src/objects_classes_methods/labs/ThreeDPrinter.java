package objects_classes_methods.labs;

public class ThreeDPrinter {
    static String brand;
    static String model;
    static String version;

    @Override
    public String toString() {
        return "ThreeDPrinter{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
