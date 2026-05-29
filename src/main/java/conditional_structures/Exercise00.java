package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise00 {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hour;

        System.out.println("What hour is it?");
        hour = sc.nextInt();

        if (hour < 12) {
            System.out.println("Good morning");
        } else if (hour < 18) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Night");
        }
        sc.close();
    }
}
