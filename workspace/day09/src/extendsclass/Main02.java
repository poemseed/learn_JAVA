package extendsclass;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle qna = new QNAArticle();
		
		qna.setNum(1);			// 부모클래스 것
		qna.setTitle("첫번째 질문");
		qna.setAnswer("첫번째 답변");	// 자식
		
//		System.out.println( "글번호 : " + qna.getNum() );
//		System.out.println( "글제목 : " + qna.getTitle() );
//		System.out.println( "글내용 : " + qna.getAnswer() );
		
		// 출력하는것은 같지만 코드 유지보수에는 취약하다
//		System.out.println( "질문/답변 [글번호 = " + qna.getNum() + "], 제목 = " + qna.getTitle() + ", 답변 = " + qna.getAnswer() );
		
		System.out.println( qna.toString() );
		
		System.out.println("---------------------------------------------");
		
		FileArticle file = new FileArticle();
		
		file.setNum(2);
		file.setTitle("두번째 자료");
		file.setFileName("두번째 파일");
		
		System.out.println( file.toString() );

	}

}
