package loop;

public class Main01 {

	public static void main(String[] args) {
		// 반복문
		// 1 ~ 5 까지 합
		// 1 + 2 + 3 + 4 + 5 = 15
		
		//for문
		int sum = 0;
		
		//i값이 1부터 5까지 증가하는 동안, i의 값을 sum에 누적한다.
		for( int i = 1; i <= 10; i++ ) {
			System.out.println("i : " + i);
			// 결과값 누적
			sum += i;
			System.out.println("sum : " + sum);
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
