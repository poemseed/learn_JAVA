package helper;

public class Main01 {

	public static void main(String[] args) {
		// 5자리의 인증번호 생성하기
		String authNum = "";
		
		for( int i = 0; i < 5; i++ ) {
			authNum += Util.getInstance().random(0, 9);
		}
		
		System.out.println("인증번호 = " + authNum);
		
//		System.out.println( Util.getInstance().random(10000, 99999) ); 0으로 시작하는게 안나올수 있으니 좋은 코드는 아님
		
	}

}
