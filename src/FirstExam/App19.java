package FirstExam;

public class App19 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int SA = 0, SB = 0;
        for (int i = 0; i < 10; i++) {
            SA += A[i];
            SB += B[i];
        }
        System.out.print((double) SA / SB);
    }
}
