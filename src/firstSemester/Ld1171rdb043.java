package firstSemester;

import java.util.Scanner;

public class Ld1171rdb043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = 0, y = 0;

        System.out.println("Sergejs Visockis IRDBD012 171RDB043");

        System.out.print("x=");
        if (sc.hasNextFloat())
            x = sc.nextFloat();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }

        System.out.print("y=");
        if (sc.hasNextFloat())
            y = sc.nextFloat();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();

        if (x > 3 && x < 4 && y > 4 && y < 5) {
            System.out.println("red");
        } else if (x > 5 && y < 4 && y > x - 2) {
            System.out.println("blue");
        } else if ((x - 5) * (x - 5) + (y - 3) * (y - 3) <= 9 && y >= 3) {
            System.out.println("green");
        } else if (x <= 10 && y >= 3 && y <= x - 5) {
            System.out.println("blue");
        } else {
            System.out.println("white");
        }
    }
}
