package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        String days;

        switch (x){
            case 1:
                days = "Sunday";
                break;
            case 2:
                days = "Monday";
                break;
            case 3:
                days = "Tuesday";
                break;
            case 4:
                days = "Wednesday";
                break;
            case 5:
                days = "Thursday";
                break;
            case 6:
                days = "Friday";
                break;
            case 7:
                days = "Saturday";
                break;
            default:
                days = "Invalid day";
                break;
        }
        System.out.println("Day Of The Week: "+ days);

        scanner.close();
    }
}
