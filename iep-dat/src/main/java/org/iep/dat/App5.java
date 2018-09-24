package org.iep.dat;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, i;
		System.out.print("N=");
		N = sc.nextInt();
		for (i = 1; i <= N; i++) {
			if (N % i == 0)
				System.out.print(i + " ");
		}
		sc.close();
	}

}
