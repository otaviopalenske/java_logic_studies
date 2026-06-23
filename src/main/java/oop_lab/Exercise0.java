package oop_lab;

import java.util.Locale;
import java.util.Scanner;

public class Exercise0 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double px = (xA + xB + xC) / 2.0;
        double ax = Math.sqrt(px * (px - xA) * (px - xB) * (px - xC));

        double py = (yA + yB + yC) / 2.0;
        double ay = Math.sqrt(py * (py - yA) * (py - yB) * (py - yC));

        System.out.printf("Triangle X area: %.4f%nTriangle Y area: %.4f%n", ax, ay);

        if (ax > ay) {
            System.out.println("Larger area: X");
        } else if (ay > ax) {
            System.out.println("Larger are: Y");
        } else {
            System.out.println("Same area value");
        }
        scanner.close();
    }
}
