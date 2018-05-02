package secondSemester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdCompetition {
    private static void symbol(String num, int count) {
        if (numberChecker(num)) {
            switch (Integer.parseInt(num)) {
                case 2:
                    String str2 = "abc";
                    display(count, str2);
                    break;
                case 3:
                    String str3 = "Def";
                    display(count, str3);
                    break;
                case 4:
                    String str4 = "ghi";
                    display(count, str4);
                    break;
                case 5:
                    String str5 = "jkl";
                    display(count, str5);
                    break;
                case 6:
                    String str6 = "Mno";
                    display(count, str6);
                    break;
                case 7:
                    String str7 = "pqrs";
                    display(count, str7);
                    break;
                case 8:
                    String str8 = "tuv";
                    display(count, str8);
                    break;
                case 9:
                    String str9 = "wxyz";
                    display(count, str9);
                    break;
                case 0:
                    if (count % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                    break;
                default:
            }
        }
    }

    private static void display(int count, String str) {
        while (count > str.length()) {
            count -= str.length();
        }
        System.out.print(str.charAt(count - 1));
    }

    private static boolean numberChecker(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(System.in))) {
            int numCount = 0;
            System.out.print("Enter line: ");
            String line = br.readLine();

            for (int i = 1; i < line.length(); i++) {
                if (line.charAt(i) == line.charAt(i - 1)) {
                    numCount++;
                } else {
                    symbol(String.valueOf(line.charAt(i - 1)), ++numCount);
                    numCount = 0;
                }
                if (i == line.length() - 1) {
                    symbol(String.valueOf(line.charAt(i)), ++numCount);
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Inpu-output error!");

        }
    }


}
