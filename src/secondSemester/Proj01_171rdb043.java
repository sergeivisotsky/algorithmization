package secondSemester;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proj01_171rdb043 {
    private static Scanner sc = new Scanner(System.in);
    private static int lastNum;

    private static int mainFunction(int numQuantity) {
        int nextNumber = 0;

        if (numQuantity > 0) {
            try {
                nextNumber = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Error!!!");
                sc.close();
                System.exit(0);
            }

            if (numQuantity == 1) {
                lastNum = nextNumber;
            }

            mainFunction(numQuantity - 1);

            if (nextNumber > lastNum) {
                lastNum = nextNumber;
            }

            sc.close();
        }

        return lastNum;
    }

    public static void main(String[] args) {
        int numCount;

        System.out.println("John Kensington 111red045");
        System.out.println("Louis Vuiton 111rdb111");

            System.out.print("count: ");

            try {
                numCount = sc.nextInt();

                if (numCount <= 0) {
                    throw new  InputMismatchException();
                }

            } catch (InputMismatchException e) {
                System.out.print("Error!!!");
                sc.close();
                return;
            }

            System.out.println("Numbers: ");
            System.out.print("Result: " + mainFunction(numCount));
        sc.close();
    }
}
