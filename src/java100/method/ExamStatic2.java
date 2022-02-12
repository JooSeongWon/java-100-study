package java100.method;

//static -->클래스명.메서드명();
public class ExamStatic2 {

	public void helloWorld() {
		System.out.println("HEllo, World");
	}
	
	public static void main(String[] args) {
		
		//[1]:메서드 호출
		//helloWorld(); //---메인 메서드는 static메서드만 호출할 수 있기 때문에 에러 --;;
		
		//[2]:객체 생성 후 메서드 호출
		ExamStatic2 es = new ExamStatic2();
		
		es.helloWorld();
	}
}
