package org.iep.dat;

import java.util.Scanner;

public class App15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, i, x;
        for (s = 0, i = 1; i <= 10; i++) {
            System.out.print("x=");
            x = sc.nextInt();
            if (x > 0 && x < 100) {
                s = s + 1;
            }
        }
        // With while
        /*
        while (i < 10) {
            System.out.print("x= ");
            x = sc.nextInt();
            if (x > 0 && x < 100) {
                s = s + 1;
                i = i + 1;
            }
        }
         */
        System.out.print("s= " + s);
        sc.close();
    }
}
