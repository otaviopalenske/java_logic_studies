package repetition_structures_for;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        for (int i = 0; i < n; i ++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (y != 0){
                double total = (double) x / y;
                System.out.printf("Division = %.1f%n", total);
            } else {
                System.out.println("Division Impossible!");
            }
        }


        scanner.close();
    }
}
