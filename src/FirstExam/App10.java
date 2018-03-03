package FirstExam;

import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();
        int s = 0, i = 3;

        while (i <= 2 * n + 1) {
            s += 1 / i ^ 2;
            i += 2;
        }

         System.out.println("s = " + s);
//        System.out.printf("%f", s);

        sc.close();
    }
}
