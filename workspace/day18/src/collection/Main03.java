package collection;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		// People class로 ArrayList 생성
		/*
		 * List를 사용하는 가장 일반적인 방법은,
		 * 사용자 정의 클래스에 대한 객체를 포함하도록 지정하는것이다.
		 */
		List<People> pl = new ArrayList<People>();
		
		// 10명의 데이터를 임의로 추가
//		pl.add( new People("에드워드", "010-0") );
//		pl.add( new People("벨라", "010-1") );
//		pl.add( new People("에릭", "010-2") );
//		pl.add( new People("안젤라", "010-3") );
//		pl.add( new People("제시카", "010-4") );
//		pl.add( new People("마이크", "010-5") );
//		pl.add( new People("에밋", "010-6") );
//		pl.add( new People("로잘리", "010-7") );
//		pl.add( new People("앨리스", "010-8") );
//		pl.add( new People("제스퍼", "010-9") );
		
		// 선생님
//		pl.add( new People("회원1", "010-0") );
//		pl.add( new People("회원2", "010-1") );
//		pl.add( new People("회원3", "010-2") );
//		pl.add( new People("회원4", "010-3") );
//		pl.add( new People("회원5", "010-4") );
//		pl.add( new People("회원6", "010-5") );
//		pl.add( new People("회원7", "010-6") );
//		pl.add( new People("회원8", "010-7") );
//		pl.add( new People("회원9", "010-8") );
//		pl.add( new Peo8le("회원10", "010-9") );
		
		for( int i = 0; i < 10; i++ ) {
			People p = new People("회원" + i, "010-" + i );
			pl.add(p);
		}
		
		
		// 출력하기
		for( int i = 0; i < pl.size(); i++ ) {
			// List에 저장된 데이터를 하나 꺼내면,
			// People 클래스 형의 객체다
			People item = pl.get(i);	// 객체를 꺼내는 거니깐 People클래스를 이용해서 꺼내야한다
			
			System.out.println(pl.get(i));
			System.out.println( item.toString() );
			System.out.println("---------------------------------");
			
		}
		
		
		
		
		
	}

}
