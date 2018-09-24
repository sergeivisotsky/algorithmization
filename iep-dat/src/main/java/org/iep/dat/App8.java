package org.iep.dat;

import java.util.Scanner;

public class App8 {

	public static void main(String[] args) {
		int n, a;
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		n = sc.nextInt();
		a = 2;
		/*while (true) {
			if (a > n) {
				break;
			} else {
				a = a * 2;
			}
		}*/
		// Without break
		while (a <= n) {
			a = a * 2;
		}
		System.out.print("a=" + a);
		sc.close();
	}

}
