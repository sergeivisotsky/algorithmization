package org.iep.dat;

import javax.annotation.processing.SupportedSourceVersion;

public class App34 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i;
        /**
         * The first version of th algorithm this is going to be quicker
         *
        for (i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]);
            else {
                System.out.print("nav");
                return;
            }
        }
        System.out.print("ir");
        */

        /**
         * The second version of the algorithm
         *
        boolean b = true;
        for (i = 1; i < a.length; i++) {
            if (a[i-1] > a[i]) {
                b = false;
            }
        }
        if (b) {
            System.out.print("ir");
        } else {
            System.out.print("nav");
        }
         */

        /**
         * The third variant of this program
         */

        boolean b = true;
        i = 1;
        while (b && i < a.length) {
            b = a[i - 1] <= a[i];
            i++;
        }
        if (b) {
            System.out.print("ir");
        } else {
            System.out.print("nav");
        }
    }
}
