package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        System.out.println("Sum = " + sum);


        sc.close();

    }

}
