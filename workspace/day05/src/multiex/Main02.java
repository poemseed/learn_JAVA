package multiex;

public class Main02 {

	public static void main(String[] args) {
		// 1~100까지 홀수의 합
		// while, continue, break
		
		int sum =  0;
		int i = 0;	// 초기값
		
		while( true ) {	// 무한루프
			i++;
			if( i % 2 == 0 ) {	// 짝수일 경우
				continue;
			}
			
			if( i > 100 ) {		//무한루프에서 벗어나게 범위를 정해줌.
				break;
			}
			
			sum += i;	// 짝수는 위에서 걸러지기때문에 홀수만 모임
			
		}
		
		System.out.println(sum);
		
		
	}

}
