package hiding;

public class Main02 {

	public static void main(String[] args) {
		// Member 클래스 객체생성
		Member member = new Member("에드워드", 20);
		
		// name, age 각각 출력
		System.out.println( "이름 : " + member.getName() );
		System.out.println( "나이 : " + member.getAge() );
		
		
	}

}
