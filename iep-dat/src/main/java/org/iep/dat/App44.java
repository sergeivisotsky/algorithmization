package org.iep.dat;

import java.util.Scanner;

public class App44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, i = 2;
        while (i <= n) {
            if (i % 2 == 0) {
                s += i * (i - 1);
            } else {
                s -= i * (i - 1);
            }
            i++;
        }
        System.out.print(s);
        sc.close();
    }
}
