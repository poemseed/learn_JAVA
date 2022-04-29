package object;

class Student{
	int age;	// 전역변수
	
	public String getName() {
		String name = "자바학생";
		return name;
	}
	
	public void sayName() {
		String myname = getName();		// this.getName(); -> this는 전역변수뿐아니라 메서드를 지칭가능 but 주로 전역변수 지칭으로 사용
		System.out.println( myname );	// 메서드 이름은 어차피 중복해서 사용할 수 없으므로   this사용 안해도 됌
	}
}

public class Main01 {

	public static void main(String[] args) {
		Student std = new Student();
		std.sayName();
		
		
		
	}

}
