package java100.method;

class TestNumber {
	int num;
	TestNumber(int num){this.num = num;}
}

public class MethodCall3 {

	
	public static void sum(TestNumber a) {

		System.out.println(a); //a��(TestNumber �ּ�)�� ���
		System.out.println(a.num); //100
		a.num = a.num + 400;
		System.out.println(a.num); //500
	}
	
	public static void main(String[] args) {
		
		//[1]:��ü ���� ����
		TestNumber a = new TestNumber(100);
		sum(a);
		System.out.println(a.num); //500 
		
	}
}
