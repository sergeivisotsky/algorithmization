package org.iep.dat;

public class App10 {
    public static void main(String[] args) {
        int N = 12;
        if (N <= 2) {
            System.out.print(1);
        } else {
            int a = 1, b = 1, i = 3, c;
            do {
                c = a + b;
                a = b;
                b = c;
                i++;
            } while (i <= N);
            System.out.print(c);
        }
    }
}
