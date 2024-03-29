/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 7 - Area of a Rectangular Room
When working in a global environment, you’ll have to present information in both metric and Imperial units. And you’ll need to know when to do the conversion to ensure the most accurate results.

Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.

Example Output

What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters

The formula for this conversion is m2 = f2 × 0.09290304

Constraints

Keep the calculations separate from the output.
Use a constant to hold the conversion factor.
 */

import util.Calculations;
import util.Output;
import util.UsrInput;

public class AreaApp {

    public static void main(String[] args) {
        double length = UsrInput.getDimensions("length");
        double width = UsrInput.getDimensions("width");
        double areaFt = Calculations.calcAreaFt(length, width);
        double areaMeter = Calculations.calcAreaMeters(length,width);
        Output.printDimensions(length, width);
        Output.printAreaFtMt(areaFt, areaMeter);
    }
}
