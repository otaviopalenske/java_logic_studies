package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();

        double account = 50.0;

        if (min > 100){
            account += (min - 100) * 2.0;
        }
        System.out.printf("Price to pay: U$ %.2f%n", account);

        scanner.close();
    }
}
