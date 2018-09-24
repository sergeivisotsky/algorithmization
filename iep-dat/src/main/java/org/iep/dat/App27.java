package org.iep.dat;

import java.util.Scanner;

public class App27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double s = Math.sin(x);
        double a = Math.sin(x);
        for (int i = 2; i <= n; i++) {
            a = Math.sin(a);
            s = s + a;
        }
        System.out.print(s);
        sc.close();
    }
}
