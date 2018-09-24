package org.iep.dat;

import java.util.Scanner;

public class App42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            System.out.print(x % 10);
            x = x / 10;
        }
        sc.close();
    }
}
