package repetition_structures_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercise00 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            sum += x;
        }
        System.out.println(sum);

        scanner.close();
    }
}
