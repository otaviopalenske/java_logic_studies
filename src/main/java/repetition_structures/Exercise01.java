package repetition_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        while (x != 0){
            x = scanner.nextInt();
        }
        scanner.close();
    }
}
