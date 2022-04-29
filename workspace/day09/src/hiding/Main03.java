package hiding;

public class Main03 {

	public static void main(String[] args) {
		Article article = new Article(1, "자바", "어렵다", "자바학생", 0, "2022-03-17");
		
		System.out.println( "글번호 : " + article.getSeq() );
		System.out.println( "글제목 : " + article.getSubject() );
		System.out.println( "글내용 : " + article.getContent() );
		System.out.println( "작성자 : " + article.getWriter() );
		System.out.println( "조회수 : " + article.getHit() );
		System.out.println( "작성일자 : " + article.getRegDate() );
		
	}

}
