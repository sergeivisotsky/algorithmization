package org.iep.dat;

import java.util.Scanner;

public class App26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int s = 1 / x, a = 1 / x;

        for (int i = 1; i <= n; i++){
            a = a / (x + i);
            s += a; // is the same as "s = s + a"
        }
        System.out.print(s);
        sc.close();
    }
}
