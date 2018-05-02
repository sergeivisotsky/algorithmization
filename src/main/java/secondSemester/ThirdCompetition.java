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

    private static void initializeElements() {
        Multimap<Integer, String> symbols = ArrayListMultimap.create();
        symbols.put(2, "a");
        symbols.put(2, "b");
        symbols.put(2, "c");
        symbols.put(3, "");
        symbols.put(3, "D");
        symbols.put(3, "e");
        symbols.put(3, "f");
        symbols.put(4, "g");
        symbols.put(4, "h");
        symbols.put(4, "i");
        symbols.put(5, "j");
        symbols.put(5, "k");
        symbols.put(5, "l");
        symbols.put(6, "M");
        symbols.put(6, "n");
        symbols.put(6, "o");
        symbols.put(7, "p");
        symbols.put(7, "q");
        symbols.put(7, "r");
        symbols.put(7, "s");
        symbols.put(8, "t");
        symbols.put(8, "u");
        symbols.put(8, "v");
        symbols.put(9, "w");
        symbols.put(9, "x");
        symbols.put(9, "y");
        symbols.put(9, "z");
        symbols.put(0, " ");
    }

    public static void main(String[] args) {
        try {
            initializeElements();
            System.out.print("Input numbers: ");
            int numbers = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Not a number!");
        }
    }
}
