package org.iep.dat;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, i, d, N; // traditionally in Java integers are written with the small "n"
		System.out.print("N=");
		N = sc.nextInt();
		System.out.print("a=");
		a = sc.nextInt();
		System.out.print("d=");
		d = sc.nextInt();
		i = 1;
		while (i < N) {
			a = a + d;
			i = i + 1;
		}
		System.out.println(a);
		sc.close();
	}

}
