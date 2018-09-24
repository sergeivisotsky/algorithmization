package org.iep.dat;

import java.util.Random;

public class App23 {
    public static void main(String[] args) {
        int m[] = new int[100];
        int n = 0, i = 0;
        Random rnd = new Random();
        while (i < 100) {
            m[i] = rnd.nextInt(40-18)-1;
            i++;
        }
        for (i = 0; i < 100; i++) {
            if (m[i] < 0) {
                n++;
            }
        }
        System.out.print(n);
    }
}
