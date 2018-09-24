package org.iep.dat;

import java.util.Scanner;

public class App14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int x;
        while (true) {
            System.out.print("x=");
            x=sc.nextInt();
            if (x==0) {
                break;
            }
            if (x<min) {
                min = x;
            }
        }
        System.out.print(min);
        sc.close();
    }
}
