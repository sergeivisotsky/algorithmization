package FirstExam;

import java.util.Scanner;

public class App30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("x = ");
        double x = sc.nextDouble();
        double s = 1 / x;
        double a = 1 / x;
        for (int i = 2; i <= n; i++) {
            a = -a / x;
            s += a;
        }
        System.out.print("s = " + s);
        sc.close();
    }
}
