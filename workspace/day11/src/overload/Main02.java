package overload;

class Hello{
	Hello(){	// 기본생성자
		System.out.println("Hello");
	}
	
	Hello( String msg ){	// 기본생성자를 Overload
		System.out.println( msg );
	}
}

public class Main02 {

	public static void main(String[] args) {
		Hello h1 = new Hello();		// 객체를 생성하는 것만으로 기본 생성자가 호출되어 거기에 있는 Hello가 출력된다
		Hello h2 = new Hello("월요일입니다.");	// 객체 생성 방법이 다양해짐
		
		
		
		
	}

}
