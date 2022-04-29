package day16;

public class SuperCar extends Car{
	String mode;
	
	public SuperCar() {
		System.out.println("자식 클래스의 기본 생성자");
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
//		setPrice(price);
		this.mode = mode;
		
	}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	
	@Override
	public String toString() {
		return "브랜드 : "+this.brand + "\n색상 : "+color+"\n가격 : "+getPrice()+"만원";
	}
	
}
