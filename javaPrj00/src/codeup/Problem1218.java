package codeup;

import java.util.Scanner;

public class Problem1218 {

	public static void main(String[] args) {
		
		//정수 3개 입력받기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//일단, 삼각형이 맞는지 판단!!!! 
		if(a+b > c) { // 삼각형 성립 조건
			if(a == b && b ==c && a == c ) {
				System.out.println("정삼각형");
			}
			else if(a == b || b == c || a == c) {
				System.out.println("이등변삼각형");
			}
			else if(a*a + b*b == c*c ) {
				System.out.println("직각삼각형");
			}else {
				System.out.println("삼각형");
			}
		}else {
			System.out.println("삼각형아님");
		}
		

		
	}
	
}
