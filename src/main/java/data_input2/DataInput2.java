package data_input2;

import java.util.Scanner;

public class DataInput2 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.printf("Data written: %n%d%n%s%n%s%n%s%n",x ,s1 ,s2 ,s3);

    }


}
