package org.iep.dat;

import java.util.Scanner;

public class App17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, s;
        int[] m = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.print("x=");
            m[i] = sc.nextInt();
        }
        s = 0;
        for (i = 0; i < 9; i++) {
            if (m[i] > m[9] && m[i] < m[9]) {
                s = s + 1;
            }
        }
        System.out.print(s);
        sc.close();
    }
}
