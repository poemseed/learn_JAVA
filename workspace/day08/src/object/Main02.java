package object;

class Member{
	String name;	// 전역변수
	int age;
	
	// getName(), return, 전역변수 name
	public String getName() {	// public 생략가능
		return this.name;		// 지역변수가 없어서 name으로 해도 되지만 this로 전역변수라는 것을 표시
	}
	
	// setName(), param name, 전역변수 name = param name
	public void setName( String name ) {
		this.name = name;
	}
	
	// getAge(), return, 전역변수 age
	public int getAge() {
		return this.age;
	}
	
	// setAge(), param age, 전역변수 age = param age
	public void setAge( int age ) {
		this.age = age;
	}
	
	// say(), getName(), getAge() 각각 출력
	public void say() {
		System.out.println( "이름 : " + getName() );	// this.getName(); -> this를 써도 되지만 메서드에선 사용 안해도 무방
		System.out.println( "나이 : " + getAge() );
	}
}



public class Main02 {

	public static void main(String[] args) {
		// Member class 객체 생성
		Member person = new Member();
		
		// 메서드를 사용해서 전역변수 name, age에 임의의 데이터 할당
		person.setName("에드워드");
		person.setAge(108);
		
		// say() 메서드 호출
		// 출력 결과값 : 임의로 할당한 데이터 값 출력
		person.say();
		
		person.setName("벨라");
		person.setAge(19);
		
		person.say();
		
	}

}
