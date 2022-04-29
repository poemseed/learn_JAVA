package loop;

public class Main03 {

	public static void main(String[] args) {
		// 1~10까지 누적된 합
		
		int sum = 0;
		
		int i = 1;	//초기식
		
		while( i <= 10 ) {
			// 결과값 누적
			sum += i;	
			i++;		// 증감식
		}
		
		System.out.println(sum);
		
	}

}
