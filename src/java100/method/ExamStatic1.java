package java100.method;

//static 메서드는 static 메서드를 호출 할 수 있다
//클래스명.메서드명();
public class ExamStatic1 {

	//static 안붙히면 main 메서드에서 사용 불가
	public static void helloWorld() {
		System.out.println("Hello, World");
	}
	
	public static void main(String[] args) {
		
		//[1]:메서드 호출
		helloWorld();
		
	}
}
