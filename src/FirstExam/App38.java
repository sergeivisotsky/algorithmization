package FirstExam;

import java.util.Scanner;

public class App38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("x = ");
            int x = sc.nextInt();
            System.out.print("n = ");
            int n = sc.nextInt();
        sc.close();
        double s = Math.sin(x);
        double a = Math.sin(x);
        for (int i = 2; i < 2 * n + 1; i += 2) {
            a = Math.sin(x) * Math.sin(x) * a;
            s += a;
        }
        System.out.print("s = " + s);
    }
}
