package day04;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		String name = "";
		String lastName = "";
		
		Scanner sc = new Scanner(System.in);
		//A.b : A안에 b
		System.out.println("이름이 뭐니?");
		name = sc.nextLine(); //공백까지 담는다. 한줄 다 담고 싶을때 사용
//		name = sc.next();  -->next()는 문자열을 담는다. 공백이 있으면 그 부분까지 담는다. 공백으로 구분함
//		lastName = sc.next();
		System.out.println(name);
//		System.out.println(lastName);
		
		sc.close();
	}
}
