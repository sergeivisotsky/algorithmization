package org.iep.dat;

import java.util.Scanner;

public class App9 {

	public static void main(String[] args) {
		double N;
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		N = sc.nextDouble();
		double S = 0;
		int i = 1;
		do {
			S = S + 1.0 / i;
			i++;
			if (S > N) {
				break;
			}
		} while(true);
		
		// Yes and No changed in flowchart
		/*do {
			S = S + 1.0 / i;
			i++;
		} while(S <= N);*/
		
		System.out.print("S=" + S);
		sc.close();
	}

}
