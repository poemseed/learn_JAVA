package object;

class StudentUser {
	String name;
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;	// 여기서는 this가 꼭 필요하지 않지만 헷갈리지 않기 위해 사용하는 것이 권장됌
	}
	
}

public class Main06 {

	public static void main(String[] args) {
		// StudentUser 클래스를 사용해서 객체를 생성한 후 객체의 메서드 만을 사용해서 전역변수 name에 "자바학생"을 할당하고 출력하여라.
		StudentUser su = new StudentUser();	// 객체 생성
		
		su.setName("자바학생");
		System.out.println( su.getName());
		
		
		
		
	}

}
