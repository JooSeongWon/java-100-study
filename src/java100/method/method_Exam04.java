package java100.method;

public class method_Exam04 {
	
	public static String capitalMethod(String str) {
		//문자열 변수 선언
		String ret = str.toUpperCase(); //toUpperCase() --> 소문자를 대문자로 바꾸는 메서드
		return ret;
	}
	
	public static void main(String[] args) {
		
		//[1]:반환값-->O	받는 인자값-->O
		//문자열 변수 선언
		String rst;
		rst = capitalMethod("korea");
		
		//[2]:출력
		System.out.println("입력한 소문자의 대문자는=" + rst);
	}
}
