package codeup;

import java.util.Scanner;

public class Problem1257 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		for(int x=a; x<=b; x++) {
			if(x%2 != 0) {
				System.out.print(x + " ");
			}
		}
		
	}

}
