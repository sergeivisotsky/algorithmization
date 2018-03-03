package FirstExam;

import java.util.Scanner;

public class App34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        double s = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            s += 1.0 / a[i];
        }
        System.out.print("B = " + 10 / s);
        sc.close();
    }
}
