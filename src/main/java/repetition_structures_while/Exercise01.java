package repetition_structures_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int password = scanner.nextInt();

        while (password != 2003) {
            System.out.println("Wrong Password");
            password = scanner.nextInt();
        }
        System.out.println("Access Granted");

        scanner.close();
    }
}
