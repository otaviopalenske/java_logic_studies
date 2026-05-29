package conditional_structures;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt();
        int endTime = sc.nextInt();

        int duration;

        if (startTime == endTime){
            duration = 24;
        } else if (startTime < endTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }

        System.out.printf("Game Duration: %d Hour(s)", duration);

        sc.close();
    }
}
