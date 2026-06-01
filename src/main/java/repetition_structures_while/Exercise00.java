package repetition_structures_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercise00 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int sum = 0;

        while (x != 0){
            sum += x;
            x = scanner.nextInt();
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
