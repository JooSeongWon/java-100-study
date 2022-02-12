package java100.method;

public class methodCall2 {

	public static void sum(Integer a) {
		a+=400;
		System.out.println(a); //---주소 값이 찍히는게 아니라 500이라는 값이 찍힌다--;;
	}
	
	public static void main(String[] args) {
		
		//[1]:변수 선언 및 메서드 호출
		//Wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언하고, new로 객체를 생성하여 해당 주소 값을 메서드로 보낸다.
		//new:객체를 생성해서 그곳의 주소를 반환
		Integer a = new Integer(100);
		sum(a);
		//[2]:출력 
		System.out.println( a);
		
	}
}
