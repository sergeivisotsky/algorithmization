public class App1 {
    public static void main(String[] args) {
        int[][] a= new int[10][10];
        // initialize array
        int s, i, j;
        s = 0;
        for (i=0; i<10; i++) {
            for (j=0; j<10; j++) {
                s+=a[i][j];
            }
        }
        System.out.print(s);
    }
}
