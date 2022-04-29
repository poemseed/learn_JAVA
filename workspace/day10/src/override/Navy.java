package override;

public class Navy extends Unit{

	public Navy(String name) {
		super(name);
		
	}	
	
	@Override
	public void attack() {
		super.attack();		// 부모에게 있는 attack메서드 가져오기
		System.out.println( this.getName() + " >> 해상 공격 실행");
		System.out.println( this.getName() + " >> 어뢰발사");
		
	}

	public void nucleus() {
		System.out.println( this.getName() + " >> 미사일 ");
	}
	
}
