package secondSemester.TestExercises;

public class EightTask {
    public static void main(String[] args) {
        String one = "abcd";
        String two = "";
        for (int i = one.length(); i > 0; i--) {
            two = two + one.charAt(i);
        }

        System.out.println(two);
    }
}
