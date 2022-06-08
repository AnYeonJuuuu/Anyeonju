package codeup;

import java.util.Scanner;

public class Problem1074 {

	public static void main(String[] args) {

		// 정수 입력받고, 카운트다운
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = n; x>=1; x--) {
			 System.out.println(x);
		}
		
	}

}
