package secondSemester.TestExercises;

interface MyInt {
    public int xx(int x);
}

public class SixthTask implements MyInt {
    @Override
    public int xx(int x) {
        return x * x;
    }

    public static void main(String[] args) {
//        MyInt o = new MyInt();
//        System.out.println(o.xx(5));
    }
}
