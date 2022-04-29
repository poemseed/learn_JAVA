package Interface;

public class Character implements Action, Fight, Move{
	private String name;
	
	// 생성자
	public Character(String name) {
		super();
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println( this.name + ">> 살금살금 걷는다.");
	}

	@Override
	public void run() {
		System.out.println( this.name + ">> 후다닥! 뛰어간다.");		
	}

	@Override
	public void jump() {
		System.out.println( this.name + ">> 점프점프!");		
	}

	@Override
	public void attack() {
		System.out.println( this.name + ">> 얍! 공격한다.");
	}

	@Override
	public void shield() {
		System.out.println( this.name + ">> 앗! 방어한다.");
	}

	@Override
	public void pickup() {
		System.out.println( this.name + ">> 줍줍! 아이템 줍는다.");
	}
	
}
