package secondSemester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThirdCompetition {
    private final char[] two = {'a', 'b', 'c'};
    private final char[] three = {'D', 'e', 'f'};
    private final char[] four = {'g', 'h', 'i'};
    private final char[] five = {'j', 'k', 'l'};
    private final char[] six = {'M', 'n', 'o'};
    private final char[] seven = {'p', 'q', 'r', 's'};
    private final char[] eight = {'t', 'u', 'v'};
    private final char[] nine = {'w', 'x', 'y', 'z'};
    private final char[] zero = {' '};

    private void pushQuantityChecker(int numberIndex, char[] answer) {
        /*char result = Arrays.toString(answer).charAt(numberIndex + 1);
        System.out.print("Result: " + result);*/
        for (int i = 0; i < numberIndex; i++) {

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
        ThirdCompetition competition = new ThirdCompetition();
        String line = reader.readLine();
        int counter = 0;
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(i - 1)) {
                counter++;
            } else {
                try {
                    String temp = String.valueOf(line.charAt(i));
                    int answer = Integer.parseInt(temp);
                    switch (answer) {
                        case 1:
                            break;
                        case 2:
                            System.out.print(competition.two[counter]);
                            break;
                        case 3:
                            System.out.print(competition.two[counter]);
                            break;
                        case 4:
                            System.out.print(competition.two[counter]);
                            break;
                        case 5:
                            System.out.print(competition.two[counter]);
                            break;
                        case 6:
                            System.out.print(competition.two[counter]);
                            break;
                        case 7:
                            System.out.print(competition.two[counter]);
                            break;
                        case 8:
                            System.out.print(competition.two[counter]);
                            break;
                        case 9:
                            System.out.print(competition.two[counter]);
                            break;
                        case 0:
                            if (counter % 2 == 0) {
                                System.out.print(" ");
                            } else {
                                System.out.print(".");
                            }
                            break;
                    }
                } catch (IllegalArgumentException ignored) {
                }
            }

        }
    }
}
