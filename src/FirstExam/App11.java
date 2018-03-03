package FirstExam;

import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = 0, i = 0;
        System.out.print("n = ");
        int n = sc.nextInt();
        while (i <= 2 * n) {
            s += (n + i) ^ 2;
            i++;
        }
        System.out.println("s = " + s);

        sc.close();
    }
}
