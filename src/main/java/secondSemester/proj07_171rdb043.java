package secondSemester;

import java.io.*;
import java.util.ArrayList;

class StudentProfile {
    private String name;
    private String surname;
    private ArrayList<Integer> marks;
}

public class proj07_171rdb043 {

    private static void readAndOutputFromFile(String getFileName) throws IOException {
        File file = new File("src\\secondSemester\\");
        final String DIR = file.getAbsolutePath() + "\\" + getFileName;
        BufferedReader readerTwo =
                new BufferedReader(
                        new FileReader(DIR));
        /*while ((data = readerTwo.readLine()) != null) {
            System.out.println(data);
        }*/
    }

    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Sergejs Visockis");
        System.out.println("Arturs Kuzmiks");
        System.out.print("Input file name: ");
        try {
            String fileName = reader.readLine();
            readAndOutputFromFile(fileName);
        } catch (IOException e) {
            System.out.println("Error! Wrong value!");
        }
    }
}
