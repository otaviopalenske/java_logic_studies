package repetition_structures_do_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a temepratura em Celsius: ");
            double c = scanner.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.print("Deseja repetir (s/n)?");
            resp = scanner.next().charAt(0);
        } while (resp != 'n');



        scanner.close();
    }
}
