package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <0){
            System.out.println("NEGATIVE");
        } else {
            System.out.println("NOT NEGATIVE");
        }
        sc.close();
    }
}
