package secondSemester.TestExercises;

class OtherFive {
    int[] a;
}

public class FifthTask {
    public static void main(String[] args) {
        OtherFive o = new OtherFive();
        o.a[0] = 1;
        o.a[1] = 2;
        o.a[2] = 3;
        int k = o.a[0] + o.a[1] + o.a[2];
        System.out.println(k);
    }
}
