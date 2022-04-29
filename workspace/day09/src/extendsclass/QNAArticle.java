package extendsclass;

/*
 * Article 클래스 상속받고,
 * 부모클래스의 title을 질문으로 보고, 답변을 추가
 * main 메서드를 포함하고 있는 class생성, 글번호, 질문(글제목), 답변 데이터 set
 * 글번호, 질문(글제목), 답변 데이터 get으로 출력
 */

public class QNAArticle extends Article{	// 부모 클래스 article 상속받음
	private String answer;	// 전역변수
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String toString() {	// 부모 메서드 바로 호출해줄수 있음
		return " 질문/답변 [글번호 = " + getNum() + ", 제목 = " + getTitle() + ", 답변 = " + getAnswer() + "]";
	}
}
