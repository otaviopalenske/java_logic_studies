package conditional_structures;

import java.util.Locale;

public class Exercise11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double price = 34.5;
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;

        System.out.println(discount);


    }
}
