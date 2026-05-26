package hello_world;

import java.util.Locale;

public class HelloWorldOld {

     static void main(String[] args) {

        String name = "Maria";
        int X = 67;
        int age = 31;
        double Y = 6.742069;
        double income = 2000.0;
        System.out.println("Hello World");
        System.out.println(X);
        System.out.println(Y);
        System.out.printf("%.2f%n", Y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", Y);
        System.out.println("Resultado = " + X + " metros");
        System.out.printf("Resultado = %.2f metros%n", Y);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, age, income);

    }
}