package org.iep.dat;

import java.util.Scanner;

public class App43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s, i;
        for (s = 0, i = 0; i <= n; i++) {
            s += (i - 1) * i;
        }
        System.out.print(s);
        sc.close();
    }
}
