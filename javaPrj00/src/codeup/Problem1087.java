package codeup;

import java.util.Scanner;

public class Problem1087 {

	public static void main(String[] args) {

		// 1. 1부터 누적해서 더하기
		// 2.입력값이 나오면 그만!
		// 3. 현재까지 누적한 값 출력
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0; 
		for(int i = 1; true ; ++i) {
			sum += i;
			
			if(sum >= n ) {
				break;// 나를 감싸고 있는 for문을 깨뜨림!!!! //반복문 탈출은 break!!
			}
		}
		System.out.println(sum);
		
		
		//여기는 내가 만든 코드!!!
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		
//		for(int x = 1; x<=n; x++) {
//			
//			sum = sum+x; // 누적 합!!!!!(기억하기 계속 잊어버림)
//			
//			if(sum >= n) {
//				break;
//			}
//		}
//		
//		System.out.println(sum);
		
	}

}
