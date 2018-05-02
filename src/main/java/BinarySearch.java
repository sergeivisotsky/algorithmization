import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearch(int[]A, int n, int x) {
        int p = 0, r = n - 1, m;
        while (p <= r) {
            m = (p + r) / 2;

            if (A[m] == x) {
                return m;
            }

            if (A[m] > x) {
                r = m - 1;
            } else {
                p = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {0, 1, 20, 15, 48, 100, 125, 1256};
        int input = 0;
        int x = sc.nextInt();
        BinarySearch(A, input, x);
        sc.close();
    }

}
