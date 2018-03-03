package FirstExam;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int s = 0, i = 1;
        int N = sc.nextInt();
        while (s < N) {
            s = 2 ^ i;
            i++;
        }
        System.out.println(s);
        sc.close();
    }
}
