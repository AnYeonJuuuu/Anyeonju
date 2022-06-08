package main;

public class Main6 {

	public static void main(String[] args) {

		// for, while , do while
		/*
		 * [문법]
		 * while(조건식){실행내용}
		 * 
		 * [문법]
		 * do{실행내용}(조건식);
		 * 
		 * [문법]
		 * for(초기식; 조건식; 증감식){실행내용}
		 */
	
		// 1~100까지 출력, 100초과하면 그만!!
		int x = 1; //초기식
		while(x <= 100) { // 조건식
			System.out.println(x);
			x++;//증감 연산자 사용! 증감식
		}
		
		//초,조,증감식 한 번에 이용할 수 있는게 for문
		for(int i= 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		
		
		
	}

}
