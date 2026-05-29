package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int quantity = sc.nextInt();
        double price = 0.0;

        if (id == 1) {
            price = 4.00;
        } else if (id == 2) {
            price = 4.50;
        } else if (id == 3) {
            price = 5.00;
        } else if (id == 4) {
            price = 2.00;
        } else if (id == 5) {
            price = 1.50;
        }

        double total = price * quantity;
        System.out.printf("Total: U$ %.2f%n", total);

        sc.close();
    }
}
