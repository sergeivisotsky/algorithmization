package secondSemester;

import java.io.*;
import java.util.ArrayList;

public class proj02_171rdb043 {
    private static BufferedReader reader =
            new BufferedReader(
                    new InputStreamReader(System.in));
    private static void readAndOutputFromFile(String getFileName) throws IOException {
        File file = new File("src\\secondSemester\\");
        final String DIR = file.getAbsolutePath() + "\\" + getFileName;
        BufferedReader readerTwo =
                new BufferedReader(
                        new FileReader(DIR));
        ArrayList<String> studentList = new ArrayList<>();
        String data;
        while ((data = readerTwo.readLine()) != null) {
            studentList.add(data);
        }

        for (String getData : studentList) {
            
        }
        /*while ((data = readerTwo.readLine()) != null) {
            System.out.println(data);
        }*/
    }

    public static void main(String[] args) {
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
