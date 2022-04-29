package multiex;

public class Main03 {

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
		
		
		
	}

}
