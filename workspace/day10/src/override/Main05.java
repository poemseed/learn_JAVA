package override;

// 부모
class PClass2{	// 생성자를 가진 클래스
	public PClass2( String str ) {	// 파라미터를 가진 생성자
		System.out.println("부모 생성자 호출 : " + str);
	}
}

// 자식
class CClass2 extends PClass2{
	public CClass2( String str ) {
//		super("부모 생성자");	// 부모 생성자 호출, 부모생성자에 파라미터가 있기때문에 부모생성자가 원하는 타입의 파라미터도 보내야함
		super(str);			// 데이터의 고정없이 넘기는 방법 ( 사용자의 입장에서 바꿀 수 있게 )
		System.out.println("자식 생성자 호출");
	}
}

/*
 * - 부모 클래스의 생성자는 상속되지 않고, 자식 클래스로 객체를 생성할때
 * 	 자동적으로 부모의 기본 생성자로 호출
 * - 부모 생성자가 매개변수를 갖고 있다면 자식 클래스를 객체화할때 자동으로
 * 	 호출되지 않는다.
 * - 따라서 자식 생성자에서 명시적으로 부모 생성자를 호출해야 한다.
 * 	 이때 사용되는 키워드가 super()이다. 단, super()를 사용할때 
 * 	 자식 생성자의 첫 줄에 위치해야 한다.
 */

public class Main05 {

	public static void main(String[] args) {
		CClass2 cClass2 = new CClass2("부모 생성자");
		
		
		
	}

}
