package day03;

public class casting {
	public static void main(String[] args) {
		
		String num1 = "1";
		String num2 = "2";
		int num3 = 3;
		
		//자동 형변화
		System.out.println(11/9);
		System.out.println(11/9.0);
		
		//강제 형변화(Casting)
		System.out.println((double)11/9);
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59));
		System.out.println((int)8.43 + (int)2.59);
		
		//문자열 형변환
		System.out.println(num1+num2);
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2)); //Integer.parseInt()는 문자열을 정수로 바꾸는 것
		System.out.println(""+num3+9); //문자열을 연결만 시켜주면 다 문자열로 바뀜
		
	}
}
