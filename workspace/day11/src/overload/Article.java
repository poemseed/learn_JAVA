package overload;

public class Article {
	private int seq;		// 글번호
	private String subject;	// 글제목
	private String writer;	// 글작성자
	
	// 파라미터가 있는 생성자
	// 자동완성하기 ( alt + shift + s -> generate Constructor using Fields )
	public Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;			
		this.subject = subject;	
		this.writer = writer;	
	}
	
	public Article( int seq, String writer ) {
		this(seq, "제목없음", writer);
//		this.seq = seq;
//		this.subject = "제목없음";
//		this.writer = writer;
	}
	
	public Article( int seq ) {
		this(seq, "제목없음", "익명");
//		this.seq = seq;
//		this.subject = "제목없음";
//		this.writer = "익명";
	}
	

	// ToString()
	// 자동완성하기 ( alt + shift + s -> generate toString )
	@Override
	public String toString() {
		return "Article [seq=" + seq + ", subject=" + subject + ", writer=" + writer + "]";
	}

	
	
	
}
