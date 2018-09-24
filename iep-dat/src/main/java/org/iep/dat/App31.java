package org.iep.dat;

public class App31 {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 2, 1, 5, 7, 2, 4, 8, 8, 4, 4};
        int i, j, s;
        for (i = 0; i < A.length; i++) {
            s = 0;
            for (j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    s++;
                }
                if (s > 1) {
                    break;
                }
            }
            if (s == 1) {
                System.out.print(A[i] + " ");
            }
        }
        /*
        for (i = 0; i < A.length; i++) {
            s = 0;
            for (j = 0; j <= i; j++) {
                if (A[i] == A[j]) {
                    s++;
                }
            }
            if (s == 1) {
                System.out.print(A[i] + " ");
            }
        }
         */
    }
}
