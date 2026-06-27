package oop_lab.exercise1.application;

import java.util.Locale;
import java.util.Scanner;

import oop_lab.exercise1.entities.Triangle;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double px = (x.a + x.b + x.c) / 2.0;
        double ax = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));

        double py = (y.a + y.b + y.c) / 2.0;
        double ay = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));

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
