package org.iep.dat;

public class App33 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] B = {1, 2, 3, 3, 4};
        int i, j;
        boolean b;
        for (i = 0; i < A.length; i++) {
            b = false;
            for (j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
