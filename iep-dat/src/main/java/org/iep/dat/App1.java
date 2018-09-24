package org.iep.dat;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, d, i = 1;
		System.out.print("a=");
		a = sc.nextInt();
		System.out.print("d=");
		d = sc.nextInt();
		while (i <= 10) {
			System.out.print(a + " ");
			i = i + 1;
			a = a + d;
		}
		sc.close();
	}

}
