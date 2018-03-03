import java.util.Random;
import java.util.Scanner;

public class Ld4171rdb035 {
    public static void main(String[] args) {

        System.out.print("John Kensington IRDBD12 171RDB035");
        // boolean lostCount = false;
        double a[][] = {{0.5, 0.5, 0.5, 0.5, 0.5},
                        {0, 1, 0, 1, 1},
                        {0.5, 1, 0.5, 0.5, 0},
                        {0, 0.5, 0, 0.5, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0.5, 0.5},
                        {0, 0.5, 0, 0, 1}};
        String ch = "n";
        int i, j, lostCount = 0, quantity = 0;
        System.out.println();
        System.out.print("Random numbers or expected (y/n)? ");
        Scanner input = new Scanner(System.in);
        if (input.hasNext()) {
            ch = input.next();
        } else {
            System.out.print("Error!");
            input.close();
            return;
        }
        input.close();
        Random rnd = new Random();

        if (ch.equals("Y") || ch.equals("y")) {
            for (i = 0; i < 5; i++) {
                for (j = 0; j < 5; j++) {
                    //a[i][j] = rnd.nextDouble(0.5, 1);
                }
            }
        } else if (ch.equals("N") || ch.equals("n")) {
            for (i = 0; i < 5; i++) {
                for (j = 0; j < 5; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.print("Error!");
            return;
        }

        System.out.print("results: ");
        for (i = 0; i < 5; i++) {
            lostCount = 0;
            quantity = 0;
            for (j = 0; j < 5; j++) {
                if (a[i][j] == 0) {
                    lostCount++;
                }

                if (lostCount == 0) {
                    quantity++;
                    System.out.print(quantity);
                }
            }
        }
    }
}
