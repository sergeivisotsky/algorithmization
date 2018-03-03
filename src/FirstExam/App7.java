package FirstExam;

public class App7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8000};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 50, 40, 8000};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
