package secondSemester;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

public class FirstCompetition {
    private static Locale latvianLocale =
            new Locale
                    .Builder()
                    .setLanguage("lv")
                    .setRegion("lv")
                    .build();

    private static ArrayList<String> surnames = new ArrayList<>();

    public static void main(String[] args) {
        Collator lvCollator = Collator.getInstance(latvianLocale);
        lvCollator.setStrength(Collator.PRIMARY);

        surnames.add("Kalniņš");
        surnames.add("Riekstiņš");
        surnames.add("Aleksejevs");
        surnames.add("Visockis");
        surnames.add("Ārbīdāns");

        System.out.println("Unsorted list: ");
        for (String unsortedSurname : surnames) {
            System.out.println(unsortedSurname);
        }

        surnames.sort(lvCollator);
        System.out.println();
        System.out.println("Sorted list: ");
        for (String sortedSurname : surnames) {
            System.out.println(sortedSurname);
        }
    }
}
