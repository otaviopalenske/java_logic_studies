package sequential_structure;

import math_functions.MathFunctions;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * Math.pow(radius, 2.0);

        System.out.printf("Area = %.4f%n", area);


        sc.close();

    }


}
