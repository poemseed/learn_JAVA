package loop;

public class Main07 {

	public static void main(String[] args) {
		int max = 100;
		
		while( max > 100 ) {
			System.out.println("while문");
		}
		
		do {
			System.out.println("do~while문");
		}while( max > 100 );	// 조건은 do안에 문을 먼저 실행하고 따지기때문에 조건이 거짓이라도 무조건 한번 실행된다
		
		
	}

}
