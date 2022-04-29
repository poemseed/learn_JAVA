package overload;

public class Main03 {

	public static void main(String[] args) {
		// 생성자가 여러가지 형태로 Overload 되어 있기 때문에 
		// 객체를 생성하는 방법이 다양해졌다.
		
		Member member1 = new Member();	// 기본생성자
		System.out.println( member1.toString() );
		
		Member member2 = new Member(25);	// age만 받는 생성자
		System.out.println( member2.toString() );
		
		Member member3 = new Member("선생님");	// job만 받는 생성자
		System.out.println( member3.toString() );
		
		Member member4 = new Member( "학생", 30 );	// job, age 받는 생성자
		System.out.println( member4.toString() );
		
		
	}

}
