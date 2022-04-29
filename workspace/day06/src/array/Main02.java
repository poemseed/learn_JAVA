package array;

public class Main02 {

	public static void main(String[] args) {
		// 문제1. num 배열에 저장된 요소의 합을 구하시오
		
		int[]num = new int[] {22, 3, 8, 12};
		int sum = 0;
		
		for( int i = 0; i < num.length; i++ ) {
			sum += num[i];
		}
		
		System.out.println("num 합 : " + sum);
		System.out.println("-------------");
		
		// 문제 2. num2배열에 저장된 요소의 합과 평균을 구하시오
		
		int[]num2 = new int[] {60, 95, 88};
		int sum2 = 0;
		
		for( int i = 0; i < num2.length; i++ ) {
			sum2 += num2[i];
		}
		
		int avg = sum2 / num2.length;
		
		System.out.println("num2 합 : " + sum2);
		System.out.println("num2 평균 : " + avg);
		System.out.println("-------------");
		
		// 문제 3. num3 배열에 저장된 요소의 최대값을 출력하시오
		// 선생님
		int[]num3 = {94, 85, 95, 88, 90};
		int max = num3[0];	
		
		for( int i = 1; i < num3.length; i++ ) {
			
			if( max < num3[i] ) {
				max = num3[i];	// 최대값은 여기에 재할당
			}
			
		} 
		
		System.out.println("최대값 : " + max);
		System.out.println("-------------");
		
		// 문제 4. num4배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		
		int[]num4 = new int[] {22, 3, 8, 12};
		int sum4 = 0, sum5 = 0; // 짝수 even, 홀수 odd
		
		for( int i = 0; i < num4.length; i++ ) {
			
			if( num4[i]%2 == 0 ) {	// 짝수
				sum4 += num4[i];
			}else {					// 홀수
				sum5 += num4[i];
			}
			
		}
		System.out.println("짝수 합 : " + sum4);
		System.out.println("홀수 합 : " + sum5);
		
		
		
		
		
	}

}
