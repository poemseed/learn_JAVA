package test2;
//220321
public class Main07 {

	public static void main(String[] args) {
		// num 배열에 저장된 요소의 최대값을 출력하시오.
		// 출력값
		// 최대값 : 95
		int[] num = {94, 85, 95, 88, 90};
		int max = num[0];
		
		for( int i = 0; i < num.length; i++ ) {
			if( max < num[i] ) {
				max = num[i];
			}
		}
		System.out.println("최대값 : " + max );
		
		System.out.println("--------");
		
		// 선생님
		int[] num1 = {94, 85, 95, 88, 90};
		int max1 = 0;
		
		for( int i = 1; i < num1.length; i++ ) {
			if( max1 < num1[i] ) {
				max1 = num1[i];
			}
		}
		System.out.println("최대값 : " + max1 );
		
		
	}

}
