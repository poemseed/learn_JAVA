package hiding;

public class Main01 {

	public static void main(String[] args) {
		// 객체생성
		StudentJava2 std = new StudentJava2();
				
		// setter 임의의 데이터 세팅, name, age 모두
		std.setName("자바학생");
		std.setAge(20);
				
		// getter 출력, name, age 모두
		System.out.println( std.getName() );
		System.out.println( std.getAge() );
	}

}
