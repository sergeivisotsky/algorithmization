package org.iep.dat;

import java.util.Scanner;

public class App36 {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9};
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (x == A[i]) {
                b = true;
            }
        }
        if (b) {
            System.out.print("Ir!!! :)");
        } else {
            System.out.print("Nav!!! :(");
        }
        sc.close();
    }
}
