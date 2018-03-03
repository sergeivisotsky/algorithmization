package FirstExam;

import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        int[] a = {0, 15, 20, 25, 60, 80, 1, 2, 3, 4, 5, 100, 1000000};
        boolean inArr = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");
        int n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                inArr = true;
            }
        }

        if (inArr) {
            System.out.println("ir");
        } else {
            System.out.println("nav");
        }

        sc.close();
    }
}
