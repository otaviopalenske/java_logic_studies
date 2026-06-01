package repetition_structures_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x == 0 && y == 0) {
            } else if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        scanner.close();
    }
}
