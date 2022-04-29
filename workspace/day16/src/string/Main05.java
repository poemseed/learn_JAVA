package string;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있습니다.
		 * 이 파일의 경로를 data라고 하는 객체로 생성한 뒤에, 다음의 형태로 출력하시오
		 * (split() 메서드 사용금지)
		 * --------------------------------------------------
		 * 파일이름	:	food
		 * 확장자		:	jpg
		 * 폴더명		:	D:/photo/2022/travel
		 */
		
		String data = new String("D:/photo/2022/travel/food.jpg");
		
		// 파일이름 찾아내기
		int fileName_last = data.lastIndexOf("/");
		// 마지막 확장자 찾아내기
		int extension_last = data.lastIndexOf(".");
		
		String fileName = data.substring( fileName_last + 1, extension_last );
		String extension = data.substring( extension_last + 1 );
		String folderName = data.substring( 0, fileName_last );
		
		System.out.println("파일 이름 : " + fileName );
		System.out.println("확장자 : " + extension );
		System.out.println("폴더명 : " + folderName );
		
		
		// 선생님
		String data1 = "D:/photo/2022/travel/food.jpg";
		
		// 파일이름 추출
		String name = data1.substring( data1.lastIndexOf("/") + 1, data1.lastIndexOf("."));
		System.out.println("파일이름 = " + name );
		
		// 확장자 추출
		String ext = data1.substring( data.lastIndexOf(".") + 1 );
		System.out.println("확장자 = " + ext);
		
		// 소스파일 폴더 이름 추출
		System.out.println("폴더명 = " + data1.substring(0, data.lastIndexOf("/")) );
	}

}
