package main;

public class MainSwitch {

	public static void main(String[] args) {

		//switch
		/*[문법] switch ( 기준값 ) {

			case 비교값 1 : 실행내용; break;
			
			case 비교값 1 : 실행내용;
			
			case 비교값 1 : 실행내용;
			
			// case 는 원하는 만큼 작성
			
			default : 실행내용;
			
			}
		 * 
		 */
		
		// 일반 == 는 문자열 비교가 안되지만
		// switch문 case에서는 문자열 비교가 가능하다!!!
		String name = "안연주";
		switch(name) {
		case "홍길동": 
			System.out.println("길동"); 
			System.out.println("반가워요 길동"); 
			break;
		case "안연주": 
			System.out.println("연주"); 
			System.out.println("반가워요 연주"); 
			if(10>0) {
				System.out.println("당연히 10이 더 크지");
			}
			break;
		case "김철수": 
			System.out.println("철수"); 
			System.out.println("반가워요 철수"); 
			break;
		}
		
	}

}
