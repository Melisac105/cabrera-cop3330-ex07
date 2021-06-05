package util;

public class Output {

    static public void printDimensions(double length, double width) {
        System.out.format("You entered dimensions of %.2f feet by %.2f feet\n", length, width);
    }

    static public void printAreaFtMt(double areaFt, double areaMt) {
        System.out.format("The area is %.2f square feet\n%.2f square meters", areaFt, areaMt);
    }
}
