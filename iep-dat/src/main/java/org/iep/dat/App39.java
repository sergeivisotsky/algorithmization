package org.iep.dat;

public class App39 {
    public static void main(String[] args) {
        int[] A = {-1, -2, -3, -4, -5, 6, 7, 8};
        int s = 0;
        for (int i = 0; i < A.length; i++) {
            s += Math.abs(A[i]);
        }
        System.out.print(s);
    }
}
