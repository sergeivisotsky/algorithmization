package FirstExam;

public class App20 {
    public static void main(String[] args) {
        int[] a = {1, 20000, 3, 4, 5, 6, 7, 8, 9, 10};
        int s = 0;
        for (int i = 1; i < 10; i++) {
            s += a[i] / i;
        }
        System.out.print(s);
    }
}
