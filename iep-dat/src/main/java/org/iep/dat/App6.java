package org.iep.dat;

import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, i;
		System.out.print("N=");
		N = sc.nextInt();
		i = 2;
		// 1st variant
		/*
		 * do { if (N % i == 0) { System.out.print("nav"); sc.close(); return; } i ++; }
		 * while (i < N); System.out.print("ir");
		 */
		
		// 2nd variant
		while (N % i != 0) i++;
		if(i==N)
			System.out.print("ir");
		else
			System.out.print("nav");
		sc.close();
	}

}
