package Interface;

public class Main01 {

	public static void main(String[] args) {
		Character ct = new Character("주인공");
		Monster mst = new Monster("몬스터");
		
		ct.walk();
		ct.run();
		ct.jump();
		ct.attack();
		ct.shield();
		ct.pickup();
		
		System.out.println("-----------------------");
		
		mst.walk();
		mst.run();
		mst.jump();
		mst.attack();
		mst.shield();
		
		
	}

}
