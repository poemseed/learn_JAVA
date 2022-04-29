package string;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호에서 생년월일을 추출하기
		 * - 8005011234567 -> 1980년 05월 01일 남자
		 * - 뒷부분 첫글자 : 1, 2: 19~	/ 3, 4: 20~ 
		 * 			  : 1,3 : 남자	/ 2, 4: 여성
		 */			  
		 
		String num = "8005011234567";
		
		String y = num.substring(0, 2);
		String m = num.substring(2, 4);
		String d = num.substring(4, 6);
		
		String gender = num.substring(6, 7);
		
		String gender_m = "남성";
		String gender_f = "여성";
		
		int yy = Integer.parseInt(y);
		int mm = Integer.parseInt(m);
		int dd = Integer.parseInt(d);
		
		int gender_num = Integer.parseInt(gender);
		int yy_19 = 1900 + yy;
		int yy_20 = 2000 + yy;
		String result = "";
		
		if( gender_num == 1 || gender_num == 3 ) {
			if( gender_num == 1 ) {
				result = String.format("%d년 %02d월 %02d일 %s ", yy_19, mm, dd, gender_m);
			}else {
				result = String.format("%d년 %02d월 %02d일 %s ", yy_20, mm, dd, gender_m);	
			}
		}else {
			if( gender_num == 2 ) {
				result = String.format("%d년 %02d월 %02d일 %s ", yy_19, mm, dd, gender_f);
			}else {
				result = String.format("%d년 %02d월 %02d일 %s ", yy_20, mm, dd, gender_f);
			}
		}
		
		System.out.println(result);
		
		
		
		// 선생님
		String jumin = "8005011234567";
		
		// 주민번호를 년, 워, 일 단위로 각 두 글자씩 자르기
		String yyy = jumin.substring(0, 2);
		String mmm = jumin.substring(2, 4);
		String ddd = jumin.substring(4, 6);
		
		// 뒷부분의 첫 글자는 성별코드이므로 별도로 추출
		String gender_code = jumin.substring(6, 7);
		
		// 태어난 년도의 판별
		if( gender_code.equals("1") || gender_code.equals("2")) {
			yyy = "19" + yyy;
		}else {
			yyy = "20" + yyy;
		}
		
		// 성별
		String gen = "남자";
		// 뒷부분 첫글자가 2, 4인 경우 여자
		if( gender_code.equals("2") || gender_code.equals("4")) {
			gen = "여자";
		}
		
		// 형식에 맞춘 내용출력( String,format + System.out.println)
		System.out.printf("%s년 %s월 %s일 %s", yyy, mmm, ddd, gen);
		
		
	}

}
