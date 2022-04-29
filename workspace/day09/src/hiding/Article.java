package hiding;

// 하나의 게시물을 표현하기 위한  JavaBeans
public class Article {
	private int seq;		// 글 번호
	private String subject;	// 글 제목
	private String content;	// 글 내용
	private String writer;	// 작성자
	private int hit;		// 조회수
	private String regDate;	// 작성일자
	
	// 파라미터가 있는 생성자
	// 자동완성 가능  오른쪽마우스 -> source -> Generate Construtor using Fields
	public Article(int seq, String subject, String content, String writer, int hit, String regDate) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
	}
	
	
//	public Article( int seq, String subject, String content, String writer, int hit, String regDate ){
//		this.seq = seq;
//		this.subject = subject;
//		this.content = content;
//		this.writer = writer;
//		this.hit = hit;
//		this.regDate = regDate;
//	}
	
	// getter, setter 추가
	public int getSeq() {
		return seq;
	}


	public void setSeq( int seq ) {
		this.seq = seq;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject( String subject ) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent( String content ) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter( String writer ) {
		this.writer = writer;
	}

	public int getHit() {
		return hit;
	}

	public void setHit( int hit ) {
		this.hit = hit;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate( String regDate ) {
		this.regDate = regDate;
	}
	
	// main 메서드를 포함하고 있는 클래스에서
	// 객체 생성 및 항목들 출력
	
	
}
