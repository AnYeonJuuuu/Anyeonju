package codeup;

import java.util.Scanner;

public class Problem1256 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i= 0; i< m; i++) {
			for(int x = 0; x<n ; x++) {
				System.out.print("*");
			}
			System.out.println();
			}
	
	}

}
