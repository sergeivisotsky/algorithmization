package firstSemester;

import java.util.Scanner;

public class Ld5171rdb043 {

    public static void main(String[] args) {
        int A[][] = new int[10][10];
        int i, j, k, C;

        System.out.println("Sergejs Visockis IRDBD12 171RDB043");
        System.out.print("Uzdevums (1/2): ");

        Scanner sc = new Scanner((System.in));
        if (sc.hasNextInt()) {
            k = sc.nextInt();
        } else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();
        if (k == 1) {
            C = 27;
            for (i = 9; i >= 0; i--) {
                for (j = i - 2; j <= i; j++) {
                    if (j >= 0) {
                        A[i][j] = C;
                        C--;
                    }
                }
            }
        } else if (k == 2) {
            for (i = 0; i <= 9; i++) {
                for (j = 9; j >= i; j--) {
                    A[i][j] = 10 - j + i;
                }
            }
        } else {
            System.out.println("input-output error");
            return;
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
