package override;

public class Unit {
	private String name;

	// 생성자 정의
	public Unit(String name) {
		super();	// 오브젝트라고 하는 자바의 최상위 클래스를 받고 있어서 존재함
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 재정의 대상
	public void attack() {
		System.out.println( this.name + " >>> 공격준비 " );
	}
	
}
