package override;

// 부모
class PClass1{	// 기본생성자를 가진 클래스
	public PClass1() {	// 기본생성자
		System.out.println("부모 생성자 호출");
	}
}

// 자식
class CClass1 extends PClass1{
	public CClass1() {
		super();	// 부모 생성자 호출, 생략 가능하고 없어도 자바 컴파일러가 알아서 있다고 판단해서 기본으로 존재함
		System.out.println("자식 생성자 호출");
	}
}

public class Main04 {

	public static void main(String[] args) {
		CClass1 cClass = new CClass1();
		
		
		
	}

}
