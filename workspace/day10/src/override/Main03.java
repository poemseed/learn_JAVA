package override;

class Hello3{
	public Hello3( String msg ) {	// 파라미터가 있는 생성자
		System.out.println(msg);
	}
	
}

class Korean3 extends Hello3{
	/*
	 * 부모와 동일한 파라미터를 받도록 생성자를 정의하고,
	 * 전달받은 파라미터를 부모에게 재전달한다.
	 */
	public Korean3( String msg ) {	// 부모 파라미터에 전달하기 위한 파라미터	
		super( msg );
	}
}

public class Main03 {

	public static void main(String[] args) {
		
		
		
		
	}

}
