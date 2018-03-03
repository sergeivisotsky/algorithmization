import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(fib(n));
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n-1) + fib(n - 2);
        }
    }
}
