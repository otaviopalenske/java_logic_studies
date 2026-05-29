package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Are Multiples");
        } else {
            System.out.println("Are Not Multiples");
        }
        sc.close();
    }
}
