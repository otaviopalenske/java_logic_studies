package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2==0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        sc.close();
    }
}
