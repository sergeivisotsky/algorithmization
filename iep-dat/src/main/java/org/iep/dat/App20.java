package org.iep.dat;

import java.util.Scanner;

public class App20 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int i;
        Scanner sc = new Scanner(System.in);
        for (i=0; i<10; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
            if(m[i] >= 0) {
                m[i] = 1;
            } else {
                m[i] = 2;
            }
        }
        for (i=0; i<10; i++) {
            System.out.print(m[i] + " ");
        }
        sc.close();
    }
}
