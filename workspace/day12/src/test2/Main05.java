package test2;
//220321
public class Main05 {

	public static void main(String[] args) {
		// 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		// 출력값
		// total=325
		// average=16
		int[][] arr = {
			{ 5, 5, 5, 5, 5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		
		int sum = 0;
		int avg = 0;
		
		for( int i = 0; i < arr.length; i++ ) {
			for( int j = 0; j < arr[i].length; j++ ) {
				sum += arr[i][j];
				avg = sum / arr[i].length;	// 이건 한줄의 평균이고  전체 평균은 5*4, 즉 20으로 나누어야함
			}
		}
		System.out.println( "total=" + sum );
		System.out.println( "average=" + avg );
		
		System.out.println("----------");
		
		// 선생님
		int total = 0;
		int average = 0;
		
		for( int i = 0; i < arr.length; i++ ) {
			for( int j = 0; j < arr[i].length; j++ ) {
				total += arr[i][j];
			}
		}
		
		average = total / (arr.length * arr[0].length );
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
		
	}

}
