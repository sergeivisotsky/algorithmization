package org.iep.dat;

import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[10];
        int n = 0;
        System.out.println("Input array elements");
        for (int i = 0; i < 10; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (m[i] > 0 && m[i] < 10) {
                n++;
            }
        }
        System.out.print(n);
        sc.close();
    }
}
