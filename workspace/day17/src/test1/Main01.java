package test1;

import java.util.Scanner;

/*
 * 7.main 메서드를 포함하는 클래스를 생성 한다.(10점)
 * 8. 2개의 정수를 입력 받는다.(10점)
 * 9.입력 받은 정수를 각각 출력 한다.(10점)
 * 10.main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.(5점)
 * 11.main 메서드에서 본인의 이름을 출력한다.(5점)
 * 12.Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)
 * 13.Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)
 */
public class Main01 {

	public static void main(String[] args) {
		// 2개의 정수를 입력 받는다.(변수선언 2개)
		int a = 3, b = 1;
		// 입력 받은 정수를 각각 출력 
		System.out.println( "정수 a = " + a );
		System.out.println( "정수 b = " + b );
		System.out.println("-------------");
		
		// 선생님
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("입력 숫자: " + num1);
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("입력 숫자: " + num2);
		scan.close();
		
		//main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.
		Calc calc = new Calc("김서정");
		// main 메서드에서 본인의 이름을 출력한다.
		System.out.println( calc.getName() );
		
		// Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.
		int plus = calc.plus(3, 1);
		int minus = calc.minus(5, 3);
		System.out.println( "plus = " + plus );
		System.out.println( "minus = " + minus );
		
		// Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다
		
		int times = calc.times(2, 4);
		int divide = calc.divide(6, 2);
		System.out.println( "times = " + times );
		System.out.println( "divide = " + divide );
		
		
		
		
		
	}

}
