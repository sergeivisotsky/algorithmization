package FirstExam;

import java.util.Arrays;

public class App27 {
    public static void main(String[] args) {
        int a[][] = {{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {11, 12, 0, 0, 0, 0, 0, 0, 0, 0},
                    {21, 22, 23, 0, 0, 0, 0, 0, 0, 0},
                    {31, 32, 33, 34, 0, 0, 0, 0, 0, 0},
                    {41, 42, 43, 44, 45, 0, 0, 0, 0, 0},
                    {51, 52, 53, 54, 55, 56, 0, 0, 0, 0},
                    {61, 62, 63, 64, 65, 66, 67, 0, 0, 0},
                    {71, 72, 73, 74, 75, 76, 77, 79, 0, 0},
                    {81, 82, 83, 84, 85, 86, 87, 89, 90, 0},
                    {91, 92, 93, 94, 95, 96, 97, 99, 100, 101}};
        int[] b = new int[55];
        int k = 0, i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < i + 1; j++) {
                b[k] = a[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
