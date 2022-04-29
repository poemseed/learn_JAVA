package test2;

/*
 * 7. main 메서드를 포함하는 클래를 생성(10)
 * 8. Student 클래스 객체 생성(10)
 * 9. Student 클래스의 총합, 평균값을 출력하는 메서드 호출(10)
 * 10. Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출(10)
 */
public class Main01 {

	public static void main(String[] args) {
		// Student 클래스 객체 생성
		Student std = new Student("에드워드", 1, 2, 3, 4, 5);
		
		// Student 클래스의 총합, 평균값을 출력하는 메서드 호출
		System.out.println( std.allPlus() );
		System.out.println( std.average() );
		
		// Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출
		std.say();
		
		
		
		
		
		
		
	}

}
