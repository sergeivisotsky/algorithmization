package org.iep.dat;

import java.util.Scanner;

public class App19 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int i;
        Scanner sc = new Scanner(System.in);
        for (i=0; i<10; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
        }
        int s = 0;
        for (i=0; i<10; i++) {
            if (m[i]%m[9] == 0) {
                s++;
            }
        }
        System.out.print("S=" + s);
        sc.close();
    }
}
