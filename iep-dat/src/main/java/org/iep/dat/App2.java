package org.iep.dat;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, d;
		System.out.print("a=");
		a = sc.nextInt();
		System.out.print("d=");
		d = sc.nextInt();
		while (a < 10000) {
			System.out.print(a + " ");
			a *= d;
		}
		sc.close();
	}

}
