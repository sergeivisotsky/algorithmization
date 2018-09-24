package org.iep.dat;

import java.util.Scanner;

public class App35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s, i;
        for (s = 0, i = 2; i <= n; i++) {
            s += (i - 1) * i;
        }
        System.out.print(s);
        sc.close();
    }
}
