public class App4 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        // initialize a
        int i, j, m;
        m = a[0][0];
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; i++) {
                if (a[i][j] > m) {
                    m = a[i][j];
                }
            }
        }
        System.out.print(m);
    }
}
