package org.iep.dat;

import java.util.Scanner;

public class App22 {
    public static void main(String[] args) {
        int[] m = new int[100];
        int i, s;
        Scanner sc = new Scanner(System.in);
        s = 0;
        for (i=0; i<100; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
        }

        for (i=0; i<100; i++) {
            if (m[i]%10==0) {
                s++;
            }
        }
        System.out.print(s);
        sc.close();
    }
}
