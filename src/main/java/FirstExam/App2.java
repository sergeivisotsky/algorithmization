package FirstExam;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] != a[9]) {
                s++;
            }
        }

        System.out.print(s);
        sc.close();
    }
}
