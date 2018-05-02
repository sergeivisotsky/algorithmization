public class Metodes6 {
    public static void change(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
    }

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5};
        change(mas);
        for (int i = 0; i < 5; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
