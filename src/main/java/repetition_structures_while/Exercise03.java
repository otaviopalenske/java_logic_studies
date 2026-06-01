package repetition_structures_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int alc = 0;
        int gas = 0;
        int diesel = 0;

        while (x != 4) {
            if (x == 1) {
                alc += 1;
            } else if (x == 2) {
                gas += 1;
            } else if (x == 3) {
                diesel += 1;
            } else {
                System.out.println("Invalid code");
            }
            x = scanner.nextInt();
        }
        System.out.println("Thank You! Have a Good One.");
        System.out.println("Alc: " + alc);
        System.out.println("Gas: " + gas);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
