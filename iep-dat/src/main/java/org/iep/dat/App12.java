package org.iep.dat;

import java.util.Scanner;

public class App12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, i = 0;
        int x;
        do {
            x = sc.nextInt();
            s = s + x;
            i = i + 1;
        } while (x != 0);
        System.out.print((double) s / i);
        sc.close();
    }
}
