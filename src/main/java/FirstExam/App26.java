package FirstExam;

public class App26 {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 9, 10};
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] < 10) {
                s++;
            }
        }
        System.out.println(s);
    }
}
