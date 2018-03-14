package secondSemester;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Student {
    private String name;
    private String surname;
    private double[] marks;

    public Student createStudent(String surname, String name, int a1,
                                 int a2, int a3, int a4, int a5) {
        Student s = new Student();
        s.marks = new double[6];
        double avr = 0;

        s.surname = surname;
        s.name = name;
        s.marks[0] = a1;
        s.marks[1] = a2;
        s.marks[2] = a3;
        s.marks[3] = a4;
        s.marks[4] = a5;
        for (int i = 0; i < s.marks.length - 1; i++) {
            avr += s.marks[i];
        }
        s.marks[5] = avr / (s.marks.length - 1);

        return s;
    }

    public void studPrint(Student[] st) {
        System.out.printf("%-10s\t%-10s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                "Surname", "Name", "Mark 1", "Mark 2", "Mark3", "Mark 4", "Mark 5", "Avr. Mark");
        System.out.printf("%-10s\t%-10s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                "-------", "--------", "------", "------", "------", "------", "------", "---------");
        for (Student aSt : st) {
            System.out.printf("%-10s\t%-10s\t", aSt.surname, aSt.name);
            for (int j = 0; j < aSt.marks.length - 1; j++) {
                System.out.printf("%3.0f\t\t", aSt.marks[j]);
            }
            System.out.printf("%6.2f", aSt.marks[aSt.marks.length - 1]);
            System.out.println();

        }
    }

    public void sortAvrMark(Student[] st) {
        System.out.printf("%-10s\t%-10s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                "Surname", "Name", "Mark 1", "Mark 2", "Mark3", "Mark 4", "Mark 5", "Avr. Mark");
        System.out.printf("%-10s\t%-10s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                "-------", "--------", "------", "------", "------", "------", "------", "---------");
        for (Student aSt : st) {
            if (aSt.marks[aSt.marks.length - 1] >= 7) {
                System.out.printf("%-10s\t%-10s\t", aSt.surname, aSt.name);
                for (int j = 0; j < aSt.marks.length - 1; j++) {
                    System.out.printf("%3.0f\t\t", aSt.marks[j]);
                }
                System.out.printf("%6.2f", aSt.marks[aSt.marks.length - 1]);
                System.out.println();
            }

        }

    }

    public void studenOut(String outpath, Student[] st) throws IOException {
        String path;
        File curent = new File(".");
        path = curent.getCanonicalPath() + "\\" + outpath;

        FileWriter tetxout = new FileWriter(new File(path));
        PrintWriter out = new PrintWriter(tetxout);

        for (Student aSt : st) {
            if (aSt.marks[aSt.marks.length - 1] >= 7) {
                out.printf("%-10s\t%-10s\t", aSt.surname, aSt.name);
                for (int j = 0; j < aSt.marks.length - 1; j++) {
                    out.printf("%3.0f\t\t", aSt.marks[j]);
                }
                out.printf("%6.2f", aSt.marks[aSt.marks.length - 1]);
                out.println();
            }
        }
        out.close();
        System.out.println("\nFile was saved in dir: " + path);
    }
}

public class Proj7_111reb779 {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] studenti;
        System.out.println("Arturs Kuzmiks 12.gr. 111REB779");
        System.out.println("Sergejs Visockis 12.gr. 171RDB043");

        try (BufferedReader br =
                     new BufferedReader(
                             new InputStreamReader(System.in))) {
            System.out.print("Input file path: ");
            String inppath = br.readLine();
            System.out.print("Output file name:");
            String outpath = br.readLine();

            studenti = writeStudents(inppath);
            student.studPrint(studenti);
            System.out.println("\nSorted\n");
            student.sortAvrMark(studenti);

            student.studenOut(outpath, studenti);
        } catch (IOException e) {
            System.out.println("We have problem, not correct file path");

        }

    }

    private static Student[] writeStudents(String path) throws IOException {
        Student[] std = new Student[(int) lineCount(path)];
        FileReader text = new FileReader(path);
        BufferedReader textread = new BufferedReader(text);
        int count = 0;

        String str;
        while ((str = textread.readLine()) != null) {
            String[] spt = str.split(" ");
            String surname = spt[0];
            String name = spt[1];
            int a1 = Integer.parseInt(spt[2]);
            int a2 = Integer.parseInt(spt[3]);
            int a3 = Integer.parseInt(spt[4]);
            int a4 = Integer.parseInt(spt[5]);
            int a5 = Integer.parseInt(spt[6]);
            std[count] = new Student().createStudent(surname, name, a1, a2, a3, a4, a5);
            count++;
        }
        textread.close();
        return std;
    }

    private static long lineCount(String path) throws IOException {
        long count;
        Path path1 = Paths.get(path);
        count = Files.lines(path1).count();
        return count;
    }
}
