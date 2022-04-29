package scanner;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// 스케너 클래스로 파라미터가 있는 스케너 객체 생성
		
		System.out.println("int type 입력 : ");
		int i = scanner.nextInt();
		System.out.println("int 결과 : " + i );
		
		System.out.println("double type 입력 : ");
		double d = scanner.nextDouble();
		System.out.println("double 결과 : " + d );
		
		System.out.println("String 입력 : ");
		String s = scanner.next();
		System.out.println("String 결과 : " + s );
		
		scanner.close();	// 스케너를 다 쓰고 꼭 닫아줘야함
	}

}
