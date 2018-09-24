package org.iep.dat;

import java.util.Scanner;

public class App18 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int i;
        Scanner sc = new Scanner(System.in);
        for (i=0; i<10; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
        }
        i = 0;
        while (i<=9) {
            if (m[i]!=m[9]) {
                m[i] = 0;
            }
            System.out.print(m[i] + " ");
            i++;
        }
        sc.close();
    }
}
