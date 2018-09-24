package org.iep.dat;

import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i = 2;
		System.out.print("n=");
		n = sc.nextInt();
		while (i <= n) {
			n = 1 + 1 / i;
			i = i + 1;
			System.out.print(n + " ");
			/*if(i > n) {
				System.out.print(i + " ");
				break;
			}*/
		}
		sc.close();
	}

}
