package FirstExam;

public class App9 {
    public static void main(String[] args) {
        int[] a = {1, 2, 15, -3, 20};
        int s = 0, i = 0;
        do {
            s += a[i];
            i++;
        } while (a[i] > 0);
        System.out.println(s);
    }
}
