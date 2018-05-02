package secondSemester;

import java.util.Scanner;

public class Ld1171rdb043 {

    // Quadratic array sorting algorithm
    public static void firstMethod(int[] array) {
        long start = System.nanoTime();

        int gCnt = (int) Math.ceil(Math.sqrt(array.length));
        int gLen = (int) Math.floor(Math.sqrt(array.length));
        int[] buf = new int[gCnt];
        int[][] gBorders = new int[gCnt][2];
        int min, bmin = 0;
        int i, j, k;

        gBorders[0][0] = 0;
        gBorders[0][1] = gLen - 1;
        for (i = 1; i <= gLen - 1; i++) {
            gBorders[i][0] = gBorders[i - 1][0] + gLen;
            gBorders[i][1] = gBorders[i - 1][1] + gLen;

        }

        gBorders[gCnt - 1][1] = array.length - 1;

        for (i = 0; i < gCnt; i++) {
            min = gBorders[i][0];
            for (j = gBorders[i][0] + 1;
                 j <= gBorders[i][1]; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            buf[i] = array[min];
            array[min] = Integer.MAX_VALUE; // array[min] is infinity
        }

        int[] arrayToStore = new int[array.length];

        for (k = 0; k < array.length; k += 1) {

            for (i = 0; i < gCnt; i++) {
                if (buf[i] < buf[bmin]) {
                    bmin = i;
                }
            }

            arrayToStore[k] = buf[bmin];
            buf[bmin] = Integer.MAX_VALUE; // buf[min] is infinity

            min = gBorders[bmin][0];
            for (i = gBorders[bmin][0] + 1;
                 i <= gBorders[bmin][1]; i++) {
                if (array[min] > array[i]) {
                    min = i;
                }
            }

            buf[bmin] = array[min];
            array[min] = Integer.MAX_VALUE; // array[min] is infinity
        }

        for (i = 0; i < array.length; i++) {
            array[i] = arrayToStore[i];
        }

        long stop = System.nanoTime();
        long delta = stop - start;
        System.out.println("Execution time: " + delta);
    }

    // Shell array sorting algorithm

    public static void secondMethod(int[] array) {
        long start = System.nanoTime();

        int step = array.length / 2;
        int temp;
        while (step > 0) {
            for (int i = 0; i < array.length - step; i++) { // In the first iteration j = 0 and goes up with the further iterations
                for (int j = i; j >= 0 &&
                        array[j] > array[j + step]; j--) {
                    temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                }
            }

            step /= 2;
        }

        long stop = System.nanoTime();
        long delta = stop - start;
        System.out.println("Execution time: " + delta);
    }

    public static void main(String[] args) {
        int arraySize;

        System.out.println("Sergejs Visockis IRDBD12 171RDB043");

        int[] arrayToSort;

        Scanner sc = new Scanner(System.in);

        // Choosing method
        System.out.print("method: ");
        int methodChoiceAnswer;
        if (sc.hasNextInt()) {
            methodChoiceAnswer = sc.nextInt();
            if (methodChoiceAnswer <= 0 || methodChoiceAnswer > 2) {
                System.out.print("input-output-error");
                sc.close();
                return;
            }
        } else {
            System.out.print("input-output-error");
            sc.close();
            return;
        }

        // Array size input
        System.out.print("count: ");
        if (sc.hasNextInt()) { // Checks if input was number
            arraySize = sc.nextInt();
            if (arraySize <= 0) {
                System.out.print("input-output-error");
                sc.close();
                return;
            }
            arrayToSort = new int[arraySize];
        } else {
            System.out.println("input-output-error");
            sc.close();
            return;
        }
        System.out.println("items:");

        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = sc.nextInt();
        }

        sc.close();

        // Sorting method caller
        switch (methodChoiceAnswer) {
            case 1:
                firstMethod(arrayToSort);
                break;
            case 2:
                secondMethod(arrayToSort);
                break;
            default:
                System.out.println("input-output-error");
                sc.close();
                return;
        }

        // Sorted array output
        System.out.println("sorted:");
        for (int sortedArrayIndex : arrayToSort) {
            System.out.print(sortedArrayIndex + " ");
        }
    }
}
