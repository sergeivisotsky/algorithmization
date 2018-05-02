public class App5 {
    public static void main(String[] args) {
        int[][] a = new int[20][5];
        // initialize a
        int i, j, ss, ns;
        for (i = 0; i < 20; i++) {
            ss = 0;
            ns = 0;
            for (j = 0; j < 5; j++) {
                if (a[i][j] == 7) {
                    ss++;
                }
                if (a[i][j] < 7) {
                    ns++;
                }
            }

            if (ss <= 2 && ns == 0) {
                System.out.println(i + " ir");
            } else {
                System.out.println(i + " nav");
            }
        }

    }
}
