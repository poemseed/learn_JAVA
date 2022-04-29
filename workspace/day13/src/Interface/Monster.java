package Interface;

public class Monster implements Fight, Move{
	private String name;
	
	// 생성자
	public Monster(String name) {
		super();
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println( this.name + ">> 뚜벅뚜벅 걷는다.");
	}

	@Override
	public void run() {
		System.out.println( this.name + ">> 다다다다다다! 뛰어간다.");	
	}

	@Override
	public void jump() {
		System.out.println( this.name + ">> 점프점프!");
	}

	@Override
	public void attack() {
		System.out.println( this.name + ">> 엇! 공격한다.");
	}

	@Override
	public void shield() {
		System.out.println( this.name + ">> 에잇! 방어한다.");
	}

}
