package codeup;

import java.util.Scanner;

public class Problem1253 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//if문 이용해서 큰 수 구분((혼자 풀 때 이 부분 안 했음!! 그래서 오류))
		if(a<b) {
			// a < b 경우
			for(int x = a; x<=b; x++) {
				System.out.print(x + " ");
			}
			
		}else {
			// a > b 경우
			for(int x = b; x<=a; x++) {
				System.out.print(x + " ");
			}
			
		}
		
		
		
		
		
	}

}
