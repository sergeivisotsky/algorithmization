import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i = 1;
        while (i <= n) {
            if (i*i == n) {
                System.out.print("ir");
            }
            i++;
        }
        inp.close();
    }
}
