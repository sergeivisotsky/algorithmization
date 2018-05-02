package secondSemester.TestExercises;

class Other {
    int a;
}

public class SecondTasks {
    public static void main(String[] args) {
        Other p, q;
        p = new Other();
        q = new Other();
        p.a = 1;
        q.a = 1;
        int k;
        if (p == q) {
            k = 1;
        } else {
            k = 2;
        }

        System.out.println(k);
    }
}
