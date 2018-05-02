package FirstExam;

import java.util.Scanner;

public class App15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        double s = 0;
        int i = 1;
        while (s <= n) {
            s += 1.0 / i;
            i++;
        }
        System.out.print("S = " + s);
        sc.close();
    }
}
