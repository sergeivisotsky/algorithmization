package FirstExam;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int n = sc.nextInt();
        System.out.println("Input quotient: ");
        int d = sc.nextInt();
        while (n < 10000) {
            System.out.println(n);
            n *= d;
        }
        sc.close();
    }
}
