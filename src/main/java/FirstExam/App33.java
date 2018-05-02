package FirstExam;

public class App33 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] a = {3, 2, 3, 3, 3, 3, 89, 0};
        int maxQuantity = 0, counter = 0;
        if (a[0] == 3) {
            counter = 1;
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i] == 3) {
                if (counter == 0) {
                    counter = 1;
                } else {
                    if (a[i - 1] == 3) {
                        counter++;
                    }
                }
            } else {
                if (counter != 0) {
                    if (counter > maxQuantity) {
                        maxQuantity = counter;
                    }
                    counter = 0;
                }
            }
        }
        if (counter > maxQuantity) {
            maxQuantity = counter;
        }
        System.out.print(maxQuantity);
    }
}
