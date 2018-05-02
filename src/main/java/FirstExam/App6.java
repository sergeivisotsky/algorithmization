package FirstExam;

public class App6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 40, 10};
        int s = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] > a[i]) {
                s++;
            }
        }

        if (s == a.length - 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
