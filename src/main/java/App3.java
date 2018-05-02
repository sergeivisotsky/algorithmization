public class App3 {
    public static void main(String[] args) {
        int a[][] = new int[20][5];
        //initialize marks
        int s, i, j;
        for (i=0; i<20; i++) {
            s = 0;
            for (j=0; j<5; j++) {
                s+=a[i][j];
            }
            System.out.println(i + " " + s/5.0);
        }
    }
}
