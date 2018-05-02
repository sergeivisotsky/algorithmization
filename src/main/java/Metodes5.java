public class Metodes5 {
    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 7;
        swap(a, b);
        System.out.println(a + " " + b);
    }
}
