package FirstExam;

import java.util.Scanner;

public class App13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, i = 3;
        System.out.print("n = ");
        int n = sc.nextInt();
        while (i <= 2 * n + 1) {
            s += 1 / i ^ 2;
            i += 2;
        }
        System.out.print("s = " + s);
        sc.close();
    }
}
