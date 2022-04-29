package loop;

public class Main06 {

	public static void main(String[] args) {
		// 구구단 7단, do ~while문으로 출력
		int j = 0;
		
		// 초기값
		int i = 1;
		
		do {
			j = i*7;
			i++;
			System.out.println(j);
		}while( i <= 9 );
		
		
	}

}
