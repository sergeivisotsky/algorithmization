public class App2 {
    public static void main(String[] args) {
        int[][] a= new int[10][10];
        // initialize array
        a[2][3] = 7;
        a[2][7] = 7;
        a[5][0] = 7;
        a[5][9] = 7;
        int x = 7;
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (a[i][j]==x) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
