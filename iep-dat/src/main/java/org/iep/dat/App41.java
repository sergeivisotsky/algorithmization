package org.iep.dat;

public class App41 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int s, i;
        for (s = 0, i = 0; i < A.length; i++) {
            s += A[i] / (i + 1);
        }
        System.out.print(s);
    }
}
