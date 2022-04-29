package helper;

public class Util {
	// -------------싱글톤 객체 생성 시작----------------
	private static Util current;	// 자신의 객체 선언
	
	public static Util getInstance( ) {
		if ( current == null ) {
			current = new Util();
		}
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private Util() {	// 생성자 잠그기
		super();
	}
	// -------------싱글톤 객체 생성 끝----------------
	
	/*
	 * 범위를 갖는 램덤값을 생성하여 리턴하는 메서드
	 * @param min - 범위 안에서의 최소값
	 * @param max - 범위 안에서의 최대값
	 * @return min~max 안에서의 랜덤값
	 */
	public int random( int min, int max ) {
		int num = (int)(( Math.random() *(max - min + 1)) + min);
		return num;
	}
	
	
	
}
