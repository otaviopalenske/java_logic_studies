package data_input;

import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a message%n");
        String message;
        message = sc.next();

        System.out.printf("Enter an integer number%n");
        int number;
        number = sc.nextInt();

        System.out.printf("Enter a floating-point number%n");
        double decimalNumber;
        decimalNumber = sc.nextDouble();

        System.out.printf("Enter a character%n");
        char character;
        character = sc.next().charAt(0);

        System.out.printf("All data written:%n%s%n%c%n%d%n%.2f%n", message, character, number, decimalNumber);



        sc.close();
    }

}
