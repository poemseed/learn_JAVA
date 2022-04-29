package day18;

	class Car {
		String brand;
		String color;
		int price;
		
		public Car() {}
		
		public Car(String brand, String color, int price) {
			this.brand = brand;
			this.color = color;
			this.price = price;
		}
		
		void engineStart() {
			System.out.println("열쇠로 시동 켬");
		}
		
		void engineStop() {
			System.out.println("열쇠로 시동 끔");
		}
		
	}

	class SuperCar extends Car{
		String mode;

		public SuperCar() {}
		
		public SuperCar(String brand, String color, int price, String mode) {
			super(brand, color, price);
			this.mode = mode;
		}
		
		void changeMode(String newMode) {
			this.mode = newMode;
			System.out.println("모드가 바뀌었습니다.");
		}
		
		@Override
		void engineStart() {
			System.out.println("음성으로 시동 켬");
		}
		
		@Override
		void engineStop() {
			System.out.println("음성으로 시동 끔");
		}
	}
	

public class CastingTest {
	public static void main(String[] args) {
		//up casting
		Car noOptionFerrari = new SuperCar();
//		noOptionFerrari.engineStart();
		
		//down casting : 오류
//		SuperCar brokenCar = (SuperCar) new Car();
//		brokenCar.changeMode("스포츠");
		
		Car car = new Car();
		SuperCar ferrari = new SuperCar();
		
		if(car instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if(ferrari instanceof Car) {
			System.out.println("nice Casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if(car instanceof SuperCar ){
			System.out.println("nice Casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if(noOptionFerrari instanceof Car){
			System.out.println("nice Casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		
		
	}
}
