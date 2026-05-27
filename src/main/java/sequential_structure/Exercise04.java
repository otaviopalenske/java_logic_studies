package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int hoursWorked = sc.nextInt();

        double hourlyRate = sc.nextDouble();

        double salary = hoursWorked * hourlyRate;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", id, salary);

        sc.close();

    }

}
