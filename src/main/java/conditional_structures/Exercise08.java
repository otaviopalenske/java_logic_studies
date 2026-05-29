package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        double tax = 0.0;

        if (salary <= 2000.00) {
            System.out.println("Tax Free");
        } else if (salary <= 3000.00) {
            tax = (salary - 2000.00) * 0.08;
            System.out.printf("U$ %.2f%n", tax);
        } else if (salary <= 4500.00) {
            tax = 80.00 + (salary - 3000.00) * 0.18;
            System.out.printf("U$ %.2f%n", tax);
        } else {
            tax = 80.00 + 270.00 + (salary - 4500.00) * 0.28;
            System.out.printf("U$ %.2f%n", tax);
        }
        scanner.close();
    }
}
