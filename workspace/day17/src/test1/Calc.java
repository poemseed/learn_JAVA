package test1;

/*
 * 1. Calc 클래스를 생성 한다.(10점)
 * 2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.(10점)
 * 3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.(5점)
 * 4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.(5점)
 * -----------------------------------------------------------------------------------
 * 5.int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.(5점)
 * 6.int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다. (5점)
 */
public class Calc {
	private String name;
	
	// 파라미터가 있는 생성자
	public Calc(String name) {	
		super();
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// 두 수의 덧셈
	public int plus( int x, int y ) {
		return x + y;
	}
	
	// 두 수의 뺄셈
	public int minus( int x, int y ) {
		return x - y;
	}
	
	// 두 수의 곱셈
	public int times( int x, int y ) {
		return x * y;
	}
	
	// 두 수의 나눗셈
	public int divide( int x, int y ) {
		int result = 0;
		
		if( y != 0 ) {		// 0에 대한 처리를 해야함
			 result = x / y;
		}
		return result;
	}
	
	
}
