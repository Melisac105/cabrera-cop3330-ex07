package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public double getDimensions(String type) {
        System.out.format("What is the %s of the room in feet: ", type);
        return input.nextDouble();
    }

}
