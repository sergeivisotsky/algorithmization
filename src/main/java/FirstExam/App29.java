package FirstExam;

import java.util.Scanner;

public class App29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 0;
        for (int i = 1; i < 2 * n - 1; i += 2) {
            s += i / (i + 2.0);
        }
        System.out.print("s = " + s);
        sc.close();
    }
}