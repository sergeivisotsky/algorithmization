package FirstExam;

import java.util.Scanner;

public class App12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, i = 2;
        System.out.print("n = ");
        int n = sc.nextInt();
        while (i <= n) {
            s = 2 ^ i;
            if (s > n) {
                System.out.println("s = " + s);
                break;
            }
            i++;
        }
        sc.close();
    }
}
