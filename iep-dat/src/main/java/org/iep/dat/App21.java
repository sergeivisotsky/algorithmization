package org.iep.dat;

import java.util.Scanner;

public class App21 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int i, s;
        Scanner sc = new Scanner(System.in);
        s = 0;
        for (i=0; i<10; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
            if(m[i]>0) {
                s = s + m[i];
            }
        }
        System.out.print(s);
        sc.close();
    }
}
