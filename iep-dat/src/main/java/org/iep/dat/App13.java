package org.iep.dat;

import java.util.Scanner;

public class App13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0, i=0;
        int x;
        while (true) {
            System.out.print("x=");
            x=sc.nextInt();
            if(x==0) {
                break;
            }
            s=s+x;
            i=i+1;
        }
        if (i!=0) {
            System.out.print((double) s / i);
        } else {
            System.out.print(0);
        }
        sc.close();
    }
}
