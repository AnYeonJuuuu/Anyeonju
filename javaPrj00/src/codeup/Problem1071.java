package codeup;

import java.util.Scanner;

public class Problem1071 {

	public static void main(String[] args) {
		//입력받은 정수를 출력을 무한반복, 근데 입력값이 0이면 "종료"
		
		// 입력받기
		// 출력하기
		
		// 위 작업을 무한 반복문으로 처리
		// 입력값이 0 이면? 반복문 종료 처리
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int x = sc.nextInt();
			if(x == 0) {
				break;
			}
			System.out.println(x);
			
		}
		
		
	}

}
