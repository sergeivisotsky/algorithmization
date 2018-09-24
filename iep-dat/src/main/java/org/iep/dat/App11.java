package org.iep.dat;

import java.util.Scanner;

public class App11 {

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		N = sc.nextInt();
		int i = 1, p = 10;
		/*while(true) {
			if (N < p) {
				break;
			}
			i++;
			p = p * 10;
		}*/
		while(N >= p) {
			i++;
			p = p * 10;
		}
		System.out.print(i);
		sc.close();
	}

}
