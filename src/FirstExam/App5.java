package FirstExam;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 1, i = 1;
        System.out.print("N = ");
        int n = sc.nextInt();
        do {
            s += 1 / i;
            i++;
        } while (s < n);
        System.out.print(s);
        sc.close();
    }
}
