package day19;

public abstract class Shape {
	double area;
	
	abstract void showArea(double w, double h);
	//final키워드는 자식클래스에서 재정의하는것을 막기위해서. 사용만 가능함
	final void function() {
		System.out.println("추상 클래스의 일반 메서드입니다.");
	}
	
}


class Rect extends Shape{

	@Override
	void showArea(double w, double h) {
		area = w*h;
		System.out.println("넓이 : "+area+ "cm²");
		
	}	
}

class Tri extends Shape{

	@Override
	void showArea(double w, double h) {
		area = (w*h) / 2;
		System.out.println("넓이 : "+area+ "cm²");
	}
}