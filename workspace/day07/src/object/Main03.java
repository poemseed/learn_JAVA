package object;

class HelloWorld{
	// 멤버변수(전역변수)는 모든 메서드가 공유한다.
	String message;
	
	void sayHello() {	// 전역변수 메세지 출력만 해주는 메서드
		System.out.println( message );
	}
	
	void setEng() {		// 영문문자열 할당 메서드
		message = "Hello Java";
	}
	
	void setKor() {		// 한글문자열 할당 메서드
		message = "안녕하세요. 자바";
	}
	
}

public class Main03 {
	
	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();	// 객체 선언과 할당
		
		// 메서드 호출
		hello.sayHello();
		hello.setEng();
		hello.sayHello();
		hello.setKor();
		hello.sayHello();
		hello.setEng();
		hello.setKor();
		hello.setEng();
		hello.setKor();
		hello.sayHello();
		
	}
	
}
