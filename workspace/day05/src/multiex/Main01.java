package multiex;

public class Main01 {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			int y = i%2;
			
			if( y == 1 ) {
				sum += i;
			}
			
		}
		
		System.out.println(sum);
		
		// 선생님
		int result = 0;
		
		for( int i = 1; i <= 10; i++ ) {
			
			if( i % 2 == 1 ){	// 홀수인 조건
				result += i; 
			}
			
		}
		
		System.out.println("1~10까지 홀수 값의 합: " + result);
		
		System.out.println("------------");
		
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		int sum1 = 0;
		
		for( int i = 1; i <= 5; i++) {
			int x = i * 2;
			sum1 += x;
		}
		
		System.out.println(sum1);
	
//		for(int i = 1; i <= 10; i++) {
//			int y = i%2;
//			
//			if( y == 0 ) {
//				sum += i;
//			}
//			
//		}
//		
//		System.out.println(sum1);
		
		// 선생님
		int result2 = 0;
		
		for( int i = 1; i <= 10; i++ ) {
			
			if( i % 2 == 0 ){	// 짝수인 조건
				result2 += i; 
			}
			
		}
		
		System.out.println("1~10까지 짝수 값의 합: " + result2);
		
		System.out.println("------------");
		
		/*
		* 문제 3.
		* 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
				
		String star1 = "";
		
		for( int i = 1; i <= 6; i++ ) {
			
			star1 = "★";

			for (int a = 1; a <= 6; a++ ) {
				
				System.out.print(star1);
				
			}
			
			System.out.println(star1);
		}
		System.out.println("------------");
		
		// 선생님
		for( int j = 0; j <= 7; j++ ) {
			for( int i = 0; i <= 7; i++ ) {
				System.out.print("★"); // print는 엔터없이 출력
			}
			System.out.println(""); // 빈문자열로 엔터있는 출력
		}
		
		System.out.println("------------");
		
		/*
		 * 문제 4. 
			★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
					

		for( int i = 1; i <= 6; i++ ) {
		 
			 for ( int a = i; a <= 6; a++) {
				 System.out.print("★");
			 }
			 
			 System.out.println(""); 
		
		}
		
		System.out.println("------------");
		
		// 선생님
		for( int j = 0; j <= 7; j++ ) {
			for( int i = j; i <= 7; i++ ) {
				System.out.print("★"); // print는 엔터없이 출력
			}
			System.out.println(""); // 빈문자열로 엔터있는 출력
		}
		
		System.out.println("------------");
		
		/*
		* 문제 5.
			★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		String starSum3 = "";	
		String star3 = "";
		
		for( int i = 1; i <= 6; i++ ) {

			 star3 = "★";
			 starSum3 += star3;
			 
			 System.out.println(starSum3);
		
		}
		
		System.out.println("------------");
		
		// 선생님
		for( int j = 7; j >= 0; j-- ) {
			for( int i = j; i <= 7; i++ ) {
				System.out.print("★"); // print는 엔터없이 출력
			}
			System.out.println(""); // 빈문자열로 엔터있는 출력
		}
		
		System.out.println("------------");
		
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
		 * 		  2중 for문, 2중 while문
		*/
		
		//for
		int table = 0;
		
		for( int num1 = 2; num1 <= 9; num1++ ) {
			
			for( int num2 = 1; num2 <= 9; num2++) {
				table = num1 * num2;
				System.out.println(num1 + " * " + num2 +" = " + table);
			}
		}
		
		//while
		
		int table2 = 0;
		int num1 = 1;
		
		while( num1 <= 8 ) {
			num1++;
			
			int num2 = 1;
			while( num2 <= 9 ) {
				
				table2 = num1 * num2;
				System.out.println(num1 + " * " + num2 +" = "+ table2);
				num2++;
			}
			
		}
		
		System.out.println("------------");
		
		// 선생님
		for( int i = 2; i <= 9; i++ ) {
			
			for( int j = 1; j <= 9; j++ ) {
				int k = i * j;
				System.out.println(k);
			}
			System.out.println("----");
		}
		
		int x = 2;
		int y = 1;
		
		while( x <= 9 ) {
			
			while( y <= 9 ) {
				int k = x * y;
				System.out.println(k);
				y++;
			}
			
			System.out.println("----");
			x++;
			y = 1;	// 첫번째 루프때 나오면서 y값이 10이므로 다음 루프때는 두번째 while이 돌지 않기 때문에 다시 y값을 1로 초기화해야함 but y선언을 어디에 했냐에 따라 필요없을수 있음
		}
		
		
	}

}
