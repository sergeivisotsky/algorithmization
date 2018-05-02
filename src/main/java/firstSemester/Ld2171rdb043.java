package firstSemester;

import java.util.Scanner;

public class Ld2171rdb043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g = 8.88, a = 55;
        double t, x = 0, y = 0, v0;
        boolean hitTarget = false;

        System.out.println("Sergejs Visockis IRDBD012 Ld2171RDB043");

        System.out.print("v0=");
        if (sc.hasNextDouble()) {
            v0 = sc.nextDouble();
        } else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();
        System.out.println("t  \t  x \t  y");
        t = 0.05;
        while ((x < 12 && y >= 0) ||
                (x >= 12 && x < 14 && y >= 8) ||
                (x >= 14 && x <= 17 && y >= 10) ||
                (x > 17 && y >= 8)) {
            t += 0.05;
            x = v0 * t * Math.cos(Math.toRadians(a));
            y = v0 * t * Math.sin(Math.toRadians(a)) - g * t * t / 2;
            System.out.printf("%3.2f\t%7.3f\t%7.3f\n", t, x, y);
            if (x >= 14 && x <= 17 && y >= 8 && y <= 10) {
                hitTarget = true;
            }
        }
        if (hitTarget) {
            System.out.println("the target was destroyed");
        } else {
            System.out.println("shot off the target");
        }
    }
}