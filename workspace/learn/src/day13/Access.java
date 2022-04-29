package day13;

public class Access { //하나의 파일안에 여러개의 클래스를 만들떄 메인클래스에면 public을 붙일 수 있다.
	
	int data1 = 10;
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;

	
	public int getData4() { //private 값이지만 접근할수있게 해주는 것 Alt + Shift + s + r
		return data4;
	}



	public void setData4(int data4) {
		this.data4 = data4;
	}



	void f() {	
	}
	
}

class Cloud {  //이 파일 안에서만 쓸수 있다.
	
	void function() {
		Access a = new Access();
	
	}
}
