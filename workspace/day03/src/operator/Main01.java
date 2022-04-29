package operator;

public class Main01 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		boolean result1 = a != b || a == b;	// t
		boolean result2 = a < b || x > y; 	// t
		boolean result3 = a < b || x < y;	// t
		boolean result4 = a > b || x > y;	// t
		boolean result5 = a > b || x < y;	// f
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("-----------------------");
		
		boolean r1 = a >= b;		// f
		boolean r2 = x >= y;		// t
		boolean result6 = r1 && r2;	// f
		boolean result7 = r1 || r2;	// t
		
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);
		System.out.println("-----------------------");
		
		boolean success = true;
		boolean fail = !success;	// f
		
		System.out.println("fail : " + fail);
		
		
		
	}

}
