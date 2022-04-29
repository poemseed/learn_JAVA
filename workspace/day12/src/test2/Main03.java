package test2;
//220321
public class Main03 {

	public static void main(String[] args) {
		// 방정식 2x+4y=10  의 모든 해를 구하시오.  단 x 와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		// 출력값
		// x=1, y=2
		// x=3, y=1
		// x=5, y=0
		int result = 0;
		
		for( int x = 0; x <= 10; x++ ) {
			for ( int y = 0; y <= 10; y++ ) {
				result = (2*x)+(4*y);
				if( result == 10 ) {
				System.out.println("x=" + x + ", y=" + y );
				}
			}
		}
		
		System.out.println("------------");
		
		// 선생님
		for( int x = 0; x <= 10; x++ ) {
			for( int y = 0; y <= 10; y++ ) {
				if( 2 * x + 4 * y == 10 ) {
					System.out.println( "x = " + x + ", y = " + y );
				}
			}
		}
		
		
		
		
	}

}
