package java100.method;

public class merhod_Exam01 {
	
	
	public static void helloWorld() {
		System.out.println("Hello, World~");
	}
	
	public static void showMenu() {
		System.out.println("showMenu() 메서드가 호출되었습니다.");
	}
	
	public static void main(String[] args) {
		
		//[1]:반환값-->X	받는 인자값-->X
		showMenu();
		helloWorld();
		
	}
}
