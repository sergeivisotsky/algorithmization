package org.iep.dat;

public class App40 {
    public static void main(String[] args) {
        int SA = 0, SB = 0;
        int[] A = {1, 2, 3};
        int[] B = {5, 6, 7};
        for (int i = 0; i < 3; i++) {
            SA += A[i];
            SB += B[i];
        }
        System.out.print(SA / SB);
    }
}
