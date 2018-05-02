package FirstExam;

public class App1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {15, 16, 17, 12, 15, 36, 56, 12, 20, 30};
        double s1 = 0, s2 = 0;
        for (int i = 0; i < 10; i++) {
            s1 += a[i];
            s2 += b[i];
        }

        System.out.print(s1 / s2);
    }
}
