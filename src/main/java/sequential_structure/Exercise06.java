package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangleArea = a * c / 2.0;
        double circleArea = 3.14159 * Math.pow(c, 2);
        double trapezoidArea = (a + b) * c / 2.0;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a * b;

        System.out.printf("TRIANGLE: %.3f%n", triangleArea);
        System.out.printf("CIRCLE: %.3f%n", circleArea);
        System.out.printf("TRAPEZOID: %.3f%n", trapezoidArea);
        System.out.printf("SQUARE: %.3f%n", squareArea);
        System.out.printf("RECTANGLE: %.3f%n", rectangleArea);

        sc.close();

    }
}
