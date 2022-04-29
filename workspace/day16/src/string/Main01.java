package string;

public class Main01 {

	public static void main(String[] args) {
		// 이메일 주소에서 아이디(student)와 도메인(java.com)을 구별하기
		
		// 이메일 주소 정의
		// split 사용 금지
		String email = "student@java.com";
		
		int email_len = email.length();
		System.out.println(email_len);
		
		
		int email_pos = email.indexOf("@");
		System.out.println(email_pos);
		
		String id = email.substring(0, 7);
		System.out.println( "아이디 : " + id);
		
		String domain = email.substring(8);
		System.out.println( "도메인 : " + domain );
		
		// 선생님
		// "@"가 나타나는 위치 얻기
		int s = email.indexOf("@");
		// 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
		String email_id = email.substring(0, s);
		
		// "@"가 나타나는 위치부터 끝까지 자르기 -> 도메인
		String email_domain = email.substring(s+1);
		
		System.out.println(email_id);
		System.out.println(email_domain);
		
		
		
	}

}
