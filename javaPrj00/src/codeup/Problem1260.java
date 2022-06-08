package codeup;

import java.util.Scanner;

public class Problem1260 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int x = a; x <= b; x++) {
			
			
			if(x % 3 == 0) {
				
				sum = sum + x;
				
			}
			System.out.println(sum);
		}
		
	}

}
