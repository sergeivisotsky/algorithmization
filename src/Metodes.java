public class Metodes {
    public static double kvadrats(double x) {
        double rez = x * x;
        return rez;
    }

    public static void main(String[] args) {
        double skaitlis = 10;
        skaitlis = kvadrats(skaitlis);
        System.out.print(skaitlis);
    }
}
