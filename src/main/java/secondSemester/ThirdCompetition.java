package secondSemester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdCompetition {

    private static void character(String number, int counter) {
        if (parseAsTheNumber(number)) {
            switch (Integer.parseInt(number)) {
                case 2:
                    final String TWO = "abc";
                    display(counter, TWO);
                    break;
                case 3:
                    final String THREE = "Def";
                    display(counter, THREE);
                    break;
                case 4:
                    final String FOUR = "ghi";
                    display(counter, FOUR);
                    break;
                case 5:
                    final String FIVE = "jkl";
                    display(counter, FIVE);
                    break;
                case 6:
                    final String SIX = "Mno";
                    display(counter, SIX);
                    break;
                case 7:
                    final String SEVEN = "pqrs";
                    display(counter, SEVEN);
                    break;
                case 8:
                    final String EIGHT = "tuv";
                    display(counter, EIGHT);
                    break;
                case 9:
                    final String NINE = "wxyz";
                    display(counter, NINE);
                    break;
                case 0:
                    if (counter % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print(".");
                    }
                    break;
            }
        }
    }

    static boolean parseAsTheNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static void display(int counter, String lineOfNumbers) {
        while (counter > lineOfNumbers.length()) {
            counter -= lineOfNumbers.length();
        }

        System.out.print(lineOfNumbers.charAt(counter - 1));
    }

    public static void main(String[] args) {
        try(BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input line: ");
            String line = reader.readLine();
            int counter = 0;
            for (int i = 1; i < line.length(); i++) {
                if (line.charAt(i) == line.charAt(i - 1)) {
                    counter++;
                } else {
                    character(String.valueOf(line.charAt(i - 1)), ++counter);
                    counter = 0;
                }

                if (i == line.length() - 1) {
                    character(String.valueOf(line.charAt(i)), ++counter);
                }

            }
        } catch (IOException e) {
            System.out.println("Input-output error!");;
        }
    }
}
