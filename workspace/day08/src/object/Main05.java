package object;

class Article{
	int seq;	// 글번호
	String subject;	// 글제목
	String writer;	// 작성자
	
	/*
	 * 파라미터가 존재하는 생성자
	 * 모든 전역변수를 초기화(=값 할당)
	 */
	public Article( int seq, String subject, String writer ) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
		
	}
	
	
	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	 */
	void say() {
		System.out.println("글번호 : " + this.seq );
		System.out.println("글제목 : " + this.subject );
		System.out.println("작성자 : " + this.writer );
	}
	
}

public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번 생성
		Article article = new Article(1, "자바는 무엇인가", "강사");
		// 객체.메서드();	(출력 메서드 호출)
		article.say();
		
		System.out.println("-----------------");
		// Article 객체 2번 생성
		Article article1 = new Article(2, "이게 맞는 건가", "학생");
		// 객체.메서드();	(출력 메서드 호출)
		article1.say();
	}

}
