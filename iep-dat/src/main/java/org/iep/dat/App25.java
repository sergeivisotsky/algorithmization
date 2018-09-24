package org.iep.dat;

import java.util.Scanner;

public class App25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.MIN_VALUE;
        int s = 0;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (x == m) {
                s++;
            } else if (x > m){
                m = x;
                s = 1;
            }
        }
        System.out.print(s);
        sc.close();
    }
}
