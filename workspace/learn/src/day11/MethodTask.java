package day11;
/*
 * 홀수를 짝수로 바꿔주는 메서드
 * 1부터 내가 입력한 정수까지의 누적합 구해주는 메서드
 * 두 정수의 나눗셈 메서드
 * 
 * 정수를 한글로 바꿔주는 메서드
 * 입력 예) 1024
 * 출력 예) 일공이사
 */
public class MethodTask {
	
	void getSumFrom1(int end){
		int result = 0;
		
		if(end >1) {
			for (int i = 1; i < end+1; i++) {
				result += i;
			}
			System.out.println(result);
		}else {
			System.out.println("1보다 큰 수를 입력하세요.");
		}
	}
	
	void div(int num1, int num2){
		double result = 0.0;
		if(num2 != 0) {
			result = Double.parseDouble(String.format("%.3f", (double)num1/num2));
			System.out.println(result);
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}
	
	//정수를 한글로 바꾸는 메서드
	void changeToHangle(String data){
		String hangle ="공일이삼사오육칠팔구";
		String result = "";
		int num = Integer.parseInt(data);
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(num % 10);
			num /= 10;
			//System.out.println(result);
		}
		for(int i=data.length()-1; i>-1; i--) {
			System.out.print(result.charAt(i));
		}
	}
	
	
	
	
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		
		m.getSumFrom1(1);
		m.getSumFrom1(10);
		
		m.div(10, 0);
		m.div(10, 3);
		m.div(10, 5);
		
		m.changeToHangle("1024");
		
		
	}
}
