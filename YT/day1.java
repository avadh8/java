package YT;

import java.util.Arrays;

public class day1 {

    public static void main(String[] args) {

        int num[] = new int[5];

        num[0] = 10;
        num[1] = 1;
        num[2] = 2;
        num[3] = 3;

        // print method 1 :

        // System.out.println(Arrays.toString(num));

        // print method 2 :

        // for (int i = 0; i < num.length; i++) {

        // System.out.println(num[i] + " ");

        // }

        // print method 3 :

        for (int element : num) {

            System.out.println(element);

        }

    }

}