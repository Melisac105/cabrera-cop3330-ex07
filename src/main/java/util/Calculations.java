package util;

public class Calculations {
    static final double CONVERSION_FACTOR = 0.09290304;

    static public double calcAreaFt(double length, double width) {
        return length * width;
    }

    static public double calcAreaMeters(double length, double width) {
        return calcAreaFt(length, width) * CONVERSION_FACTOR;
    }

}
