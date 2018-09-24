package org.iep.dat;

import java.util.Scanner;

public class App37 {
    public static void main(String[] args) {
        int s = 0;
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 3 == 0) {
                s++;
            }
        }
        System.out.print(s);
        sc.close();
    }
}
