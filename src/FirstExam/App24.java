package FirstExam;

public class App24 {
    public static void main(String[] args) {
        int[] a = {2, 45, 56, 7, 8, 29, 44, 120, 76};
        int[] b = {7, 4, 45, 120, 77, 88, 90, 56, 71};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
