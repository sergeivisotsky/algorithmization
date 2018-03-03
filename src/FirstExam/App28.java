package FirstExam;

import java.util.Scanner;

public class App28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        int x = sc.nextInt();

        System.out.print("n = ");
        int n = sc.nextInt();

        double s = 1.0 / x, a = 1.0 / x;
        int i = 1;
        while (i <= n) {
            s += 1.0 / (x * (x + i));
            i++;
        }
        System.out.print("S = " + s);
        sc.close();
    }
}
