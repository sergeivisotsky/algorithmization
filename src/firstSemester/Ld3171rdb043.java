package firstSemester;

import java.util.Random;
import java.util.Scanner;

public class Ld3171rdb043 {

    public static void main(String[] args) {

        int A[] = new int[20];
        int K, i;
        int C;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sergejs Visockis IRDBD12 171RDB043");
        System.out.print("K=");
        if (sc.hasNextInt()) {
            K = sc.nextInt();
        } else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();
        if (K==0) {
            Random r = new Random();
            for(i=0; i<20; i++) {
                A[i] = r.nextInt(50+1+50)-50;
            }
        } else {
            A[0] = 1;
            for (i=1; i<20; i++) {
                A[i] = A[i - 1] + K;
            }
        }

        System.out.println("\nA:");

        i=0;
        while (i<20) {
            System.out.print(A[i] + "\t");
            if (i==9) {
                System.out.println();
            }
            i++;
        }

        i = 0;
        C = A[i];
        do {
            A[i] = A[i + 1];
            i++;
        } while (i<19);
        A[i] = C;

        System.out.println("\nA:");

        for (i=0; i<20; i++) {
            System.out.print(A[i] + "\t");
            if (i==9) {
                System.out.println();
            }
        }
    }

}