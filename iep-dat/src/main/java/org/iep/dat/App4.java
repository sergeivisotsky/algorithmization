package org.iep.dat;

import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, i;
		System.out.print("N=");
		N = sc.nextInt();
		i = 1;
		do {
			if (N % i == 0) {
				System.out.print(i + " ");
			}
			i = i + 1;

		} while (i <= N);
		sc.close();
	}

}
