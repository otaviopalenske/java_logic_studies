package repetition_structures_for;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            int cube = i * i * i;

            System.out.printf("%d %d %d%n", i, square, cube);
        }

        scanner.close();
    }
}
