package FirstExam;

import java.util.Scanner;

public class App31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int i = 1;
        int s = i * (i + 1);
        int a = - i * (i + 1);
        while (i <= n) {
            a = - a * (i + 1);
            s += a;
            i++;
        }
        System.out.print("s = " + s);
        sc.close();
    }
}
