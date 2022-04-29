package test1;
//220321
public class Main05 {

	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오.
		int sum = 0;
		
		for( int i = 1; i <= 10; i++ ) {
			for ( int j = 1; j <= i; j++ ) {
				sum += j;
			}
			
		}
		System.out.println(sum);
		
		// 선생님
		int sum1 = 0;
		int totalSum = 0;
		
		for( int i = 1; i <= 10; i++ ) {
			sum1 += i;			// sum값은 결과적으로 (1+2+3+...+10)이 담김
			totalSum += sum1;	// 그래서 1+(1+2)+(1+2+3)+.. 이런 for문이 돌면서 나온 sum값을 누적하는 totalSum
			System.out.println(totalSum);
		}
		System.out.println("totalSum = " + totalSum );
		
	}

}
