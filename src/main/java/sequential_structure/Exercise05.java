package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int partCode1 = sc.nextInt();
        int quantity1 = sc.nextInt();
        double unitPrice1 = sc.nextDouble();

        int partCode2 = sc.nextInt();
        int quantity2 = sc.nextInt();
        double unitPrice2 = sc.nextDouble();

        double totalPrice = quantity1 * unitPrice1 + quantity2 * unitPrice2;

        System.out.printf("TOTAL: U$ %.2f%n", totalPrice);

        sc.close();
    }

}
