package firstSemester;

import java.util.Random;
import java.util.Scanner;

public class Ld4171rdb043 {

    public static void main(String[] args) {
        int A[][] = {{0, 1, 2, 0, 2},
                {4, 4, 4, 4, 4},
                {0, -1, 8, 10, -1},
                {0, 3, -1, 2, 1},
                {4, 8, 4, 8, 12},
                {-1, -1, 2, 0, 1},
                {1, 8, 2, 4, -1},
                {8, 16, -1, 4, 0}};
        int i, j;
        int penaltyCount, disqualCount;
        String ch = "n";

        System.out.println("Sergejs Visockis IRDBD12 171RDB043");
        System.out.print("Aizpildit masivu ar patvaligiem skaitliem (y/n)? ");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()) {
            ch = sc.next();
        } else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();
        Random rnd = new Random();
        if (ch.equals("Y") || ch.equals("y")) {
            for (i = 0; i < 8; i++) {

                for (j = 0; j < 5; j++) {
                    A[i][j] = rnd.nextInt(40 - 18) - 1;
                }

            }
        } else {
            if (!ch.equals("N") && !ch.equals("n")) {
                System.out.println("input-output error");
                return;
            }
        }

        for (i = 0; i < 8; i++) {

            for (j = 0; j < 5; j++) {
                System.out.print(A[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("results: ");
        for (i = 0; i < 8; i++) {
            penaltyCount = 0;
            disqualCount = 0;

            for (j = 0; j < 5; j++) {

                if (A[i][j] == -1) {
                    disqualCount++;
                }

                if (A[i][j] != 0 && A[i][j] >= 5) {
                    penaltyCount++;
                }

            }

            if (penaltyCount == 0 && disqualCount == 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
