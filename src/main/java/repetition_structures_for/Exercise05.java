package repetition_structures_for;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fact = 1;

        for (int i = n; i > 0; i --) {
            fact *= i;
        }

        System.out.println(fact);

        scanner.close();
    }

}
