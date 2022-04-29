package object;

class Calc{
	
	// plus, param int x, int y, return
	int plus( int x, int y ) {
		return x + y;
	}
	
	// minus, param int x, int y, return
	int minus( int x, int y ) {
		return x - y;
	}
	
	// times, param int x, int y, return
	int times( int x, int y ) {
		return x * y;
	}
	
	// divide, param int x, int y, return
	int divide( int x, int y ) {
		int result = 0;	// 결과값 변수로, 만약 0으로 입력했을 때 if문을 안타기 때문에  리턴값이 0으로 출력된다.
		
		if( y != 0 ) {	// 0으로 나눌 수 없으므로 조건식
		result =  x / y;
		}
		
		return result;
	}
}

public class Main04 {

	public static void main(String[] args) {
		// 객체생성
		Calc calc = new Calc();
		
		// plus
		System.out.println( "plus : " + calc.plus(5, 5) );
		
		// minus
		System.out.println( "minus : " + calc.minus(9, 9) );
		
		// times
		System.out.println( "times : " + calc.times(3, 2) );
		
		// divide
		System.out.println( "divide : " + calc.divide(6, 2) );
		
	}

}
