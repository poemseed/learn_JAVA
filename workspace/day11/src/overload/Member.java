package overload;

public class Member {
	// 전역변수
	private String job;
	private int age;
	
	// 기본 생성자
	public Member() {
		
	}
	
	// age를 param값으로, 생성자
	public Member( int age ) {	// Overload
		this.age = age;
	}

	// job를 param값으로, 생성자
	public Member( String job ) {
		this.job = job;
	}
	
	// job, age를 param값으로, 생성자
	public Member( String job, int age ) {
		this.job = job;
		this.age = age;
	}

	
	// 클래스명, job, age를 출력해주는 toString()
	// 자동완성 가능  오른쪽 마우스 -> source -> generate toString
	@Override
	public String toString() {
		return "Member [job=" + job + ", age=" + age + "]";
	}
	
	
//	public String toString() {	// 메서드
//		return "Member [ job = " + job + ", age = " + age + "]"; 
//	}
	
	// main() 클래스 생성, 객체생성을 생성자 타입별로 생성 후, 출력
}
