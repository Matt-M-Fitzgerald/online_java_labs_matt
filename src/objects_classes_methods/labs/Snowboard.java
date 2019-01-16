package objects_classes_methods.labs;

public class Snowboard {

    static String brand;
    static double size;
    static String promodel;

    @Override
    public String toString() {
        return "Snowboard{" +
                "brand= " + brand + '\'' +
                "size=" + size + '\'' +
                "Pro model=" + promodel + '\'' +
                "}";
    }
}
