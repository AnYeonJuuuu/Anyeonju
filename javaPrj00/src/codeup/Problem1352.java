package codeup;

import java.util.Scanner;

public class Problem1352 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 0; x<n; x++) {
			for(int i = 0; i<n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
