package org.iep.dat;

import java.util.Scanner;

public class App38 {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int s = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                s += A[i];
            } else {
                break;
            }
        }
        System.out.print(s);
        sc.close();
    }
}
