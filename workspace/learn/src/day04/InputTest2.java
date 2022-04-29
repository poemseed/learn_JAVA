package day04;

import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		sc.nextInt();
		System.out.println("이름을 입력하세요");
		sc.nextLine(); //엔터도 다 담기때문에 한번만 쓰면 안되고 두번사용해야한다 next()는 그걸구분점으로 봐서 괜찮다
		sc.nextLine();
	}

}
