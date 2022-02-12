package java100.method;

class TestNumber {
	int num;
	TestNumber(int num){this.num = num;}
}

public class MethodCall3 {

	
	public static void sum(TestNumber a) {

		System.out.println(a); //a값(TestNumber 주소)을 출력
		System.out.println(a.num); //100
		a.num = a.num + 400;
		System.out.println(a.num); //500
	}
	
	public static void main(String[] args) {
		
		//[1]:객체 변수 선언
		TestNumber a = new TestNumber(100);
		sum(a);
		System.out.println(a.num); //500 
		
	}
}
