package FirstExam;

import java.util.Scanner;

public class App16 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int s = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] != a[9]) {
                s++;
            }
        }

        System.out.print(s);
    }
}
