package FirstExam;

import java.util.Arrays;

public class App17 {
    public static void main(String[] args) {
        int[] a = {-3, -4, -6, 7, 0, -70, 6, 5, 4, 5};
        for (int i = 0; i < 10; i++) {
            if (a[i] >= 0) {
                a[i] = 1;
            } else {
                a[i] = 2;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
