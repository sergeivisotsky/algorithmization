package org.iep.dat;

public class App32 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] B = {1, 2, 3, 3, 4};
        int i, j, s;
        for (i = 0; i < A.length; i++) {
            s = 0;
            for (j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    s++;
                }
            }
            if (s == 0) {
                for (j = 0; j < B.length; j++) {
                    if (A[i] == B[j]) {
                        System.out.print(A[i] + " ");
                        break;
                    }
                }
            }

        }
    }
}
