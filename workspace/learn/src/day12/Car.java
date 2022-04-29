package day12;

public class Car {
	int price;
	String color;
	String brand;
	//Overloading
	Car(){}
	
	public Car(int price, String color, String brand) { //임의생성자를 만들었음
		this.price = price;
		this.color = color;
		this.brand = brand;
	}

	double speedUp(double speed){
		speed++;
		return speed;
	}
	
	double speedDown(double speed){
		speed--;
		return speed;
	}
	
	void showInfo() {
		System.out.println(this);
		System.out.println("브랜드 : "+this.brand+"\n색상 : "+color+"\n가격 : "+price+"만원");  //this가 생략되어 있는것임 생략가능함
	}
	
	public static void main(String[] args) {
		//객체화
		//인스턴스 변수
		//클래스명() : 기본 생성자
		//클래스를 선언하면 자동으로 선언되는 생성자
		
		Car momCar = new Car(9000, "black","Benz");
		momCar.showInfo();
		Car dadyCar = new Car();
		Car myCar = new Car();
		
//		momCar.brand = "Benz";
//		momCar.color = "Black";
//		momCar.price = 9000;
//		
//		momCar.showInfo();
//		System.out.println(momCar);
//		
//		dadyCar.showInfo();
		
		
		
		
	}
	
}
