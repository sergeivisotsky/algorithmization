package FirstExam;

import java.util.Scanner;

public class App14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int a = 2;
        while (a <= n) {
            a *= 2;
        }
        System.out.println("S = " + a);
        sc.close();
    }
}
