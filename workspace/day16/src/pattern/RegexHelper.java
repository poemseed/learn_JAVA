package pattern;

import java.util.regex.Pattern;

public class RegexHelper {
	/*
	 * 1.싱글톤
	 * 2.boolean isValue(String str), str 		: 검사할 문자열, 공백, null체크
	 * 3.boolean isNum(String str),  str 		: 검사할 문자열, 숫자 형식 검증체크
	 * 4.boolean isEng(String str),  str 		: 검사할 문자열, 영문인지 검증체크
	 * 5.boolean isKor(String str),  str 		: 검사할 문자열 , 한글인지 검증체크
	 * 6.boolean isEngNum(String str),  str 	: 검사할 문자열, 영문/숫자인지 검증체크
	 * 7.boolean isKorNum(String str),  str 	: 검사할 문자열, 한글/숫자인지 검증체크
	 * 8.boolean isEmail(String str),  str 		: 검사할 문자열, email인지 검증체크
	 * 9.boolean isCellPhone(String str),  str 	: 검사할 문자열, 휴대전화번호 인지 검증체크
	 * ----------------------------------------------------------------------
	 * main() class에서 해당 메서드 사용
	 */
	
	//-------------------싱글톤 시작----------------------
	private static RegexHelper current;	// 객체 생성
	
	public static RegexHelper getInstance() {
		if( current == null ) {
			current = new RegexHelper();
		}
		return current;
	}
	
	public static void freeInstance() {	// 메모리에서 없애는 메서드
		current = null;
	}
	
	private RegexHelper() {	// 객체 생성 방지
		super();
	}
	
	//-------------------싱글톤 끝----------------------
	
	// 공백, null
	public boolean isValue_me( String str ) {
		boolean blank = Pattern.matches("^\\S$", str);
		boolean find_null = Pattern.matches("^/\\b(?:(?!null)\\w)+\\b/g$", str);
		
		if ( !blank ) {
			System.out.println("빈칸이 있습니다.");
		}else if( !find_null ) {
			System.out.println("null이 있습니다.");
		}
		
		return true;
	}
	
	// 선생님
	// boolean isValue(String str), str 		: 검사할 문자열, 공백, null체크
	/*
	 * 주어진 문자열이 공백이거나 null인지 검사
	 * @param str	: 검사할 문자열
	 * @return boolean	: 공백, null이 아닌 경우 true 리턴
	 */
	
	public boolean isValue (String str) {
		boolean result = false;
		
		if( str != null ) {	// null이 아닐 경우 if문을 탄다
			result = !str.trim().equals("");	// 앞뒤 공백을 trim()으로 제거하고 이퀄로 공백인지 체크
		}
		return result;
	}
	
	
	
	
	// 숫자
	public boolean isNum_me( String str ) {
		boolean isNum = Pattern.matches("^[0-9]*$", str);
		if( !isNum ) {
			System.out.println("숫자만 있어야 합니다.");
			
		}
		return true;
	}
	
	// 선생님
	/*
	 * 숫자 모양에 대한 형식 검사
	 * @param str	: 검사할 문자열
	 * @return boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	
	public boolean isNum (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[0-9]*$", str);
		}
		
		return result;
	}
	
	
	
	// 영어
	public boolean isEng_me( String str ) {
		boolean isEng = Pattern.matches("^[a-zA-Z]*$", str);
		if( !isEng ) {
			System.out.println("영어만 입력하세요");
		}
		return true;
	}
	
	// 선생님
	/*
	 * 영문으로만 구성되어있는지에 대한 형식 검사
	 * @param str	: 검사할 문자열
	 * @return boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	
	public boolean isEng (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[a-zA-Z]*$", str);
		}
		
		return result;
	}
	
	
	
	// 한글
	public boolean isKor_me( String str ) {
		boolean isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		if( !isKor ) {
			System.out.println("한글만 입력하세요");
		}
		return true;
	}
	
	//선생님
	/*
	 * 한글으로만 구성되어있는지에 대한 형식 검사
	 * @param str	: 검사할 문자열
	 * @return boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	
	public boolean isKor (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		
		return result;
	}
	
	
	
	// 영문, 숫자
	public void isEngNum_me( String str ) {
		boolean isEngNum = Pattern.matches("^[a-zA-Z0-9]*$", str);
		if( !isEngNum ) {
			System.out.println("영어와 숫자만입력하세요");
			return;
		}
	}
	
	//선생님
	/*
	 * 영문, 숫자로만 구성되어있는지에 대한 형식 검사
	 * @param str	: 검사할 문자열
	 * @return boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
		
	public boolean isEngNum (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[a-zA-Z0-9]*$", str);
		}
		
		return result;
	}
	
	
	
	//한글, 숫자
	public void isKorNum_me( String str ) {
		boolean isKorNum = Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", str);
		if( !isKorNum ) {
			System.out.println("한글과 숫자만 입력하세요");
			return;
		}
	}
	
	//선생님
	/*
	 * 한글, 숫자로만 구성되어있는지에 대한 형식 검사
	 * @param str	: 검사할 문자열
	 * @return boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
			
	public boolean isKorNum (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", str);
		}
		
		return result;
	}
	
	
	
	// 이메일
	public void isEmail_me( String str ) {
		boolean isEmail = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str);
		if( !isEmail ) {
			System.out.println("이메일형식이 잘못되었습니다.");
			return;
		}
	}
	
	//선생님
	/*
	 * 이메일에 대한 형식 검사
	 * @param str	: 검사할 문자열
	 * @return boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
			
	public boolean isEmail (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str);
		}
		
		return result;
	}
	
	
	
	// 전화번호
	public void isCellPhone_me( String str ) {
		boolean isCellPhone = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
		if( !isCellPhone ) {
			System.out.println("폰번호 입력이 잘못되었습니다.");
			return;
		}
	}
	
	//선생님
	/*
	 * 전화번호에 대한 형식 검사
	 * @param str	: 검사할 문자열
	 * @return boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
			
	public boolean isCellPhone (String str) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
		}
		
		return result;
	}
	
	
}
