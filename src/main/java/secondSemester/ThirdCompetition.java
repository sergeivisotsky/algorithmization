package secondSemester;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ThirdCompetition {
    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    private static void pushQuantityChecker() {

    }

    public static void main(String[] args) {
        try {
            int answer;
            char[] one;
            char[] two = {'a', 'b', 'c'};
            char[] three = {'D', 'e', 'f'};
            char[] four = {'g', 'h', 'i'};
            char[] five = {'j', 'k', 'l'};
            char[] six = {'M', 'n', 'o'};
            char[] seven = {'p', 'q', 'r', 's'};
            char[] eight = {'t', 'u', 'v'};
            char[] nine = {'w', 'x', 'y', 'z'};
            char[] zero = {' '};

            System.out.println("1: ");
            System.out.println("2: abc");
            System.out.println("3: Def");
            System.out.println("4 ghi:");
            System.out.println("5: jkl");
            System.out.println("6: Mno");
            System.out.println("7: pqrs");
            System.out.println("8: tuv");
            System.out.println("9: wxyz");
            System.out.println("0: space");
            System.out.print("Answer: ");
            answer = Integer.parseInt(reader.readLine());
            switch (answer) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    break;
                    default:
                        System.out.println("Restricted option!");
                        break;
            }

            System.out.print("Result: ");
        } catch (IOException e) {
            System.out.println("Not a number!");
        }
    }
}
