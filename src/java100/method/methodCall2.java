package java100.method;

public class methodCall2 {

	public static void sum(Integer a) {
		a+=400;
		System.out.println(a); //---�ּ� ���� �����°� �ƴ϶� 500�̶�� ���� ������--;;
	}
	
	public static void main(String[] args) {
		
		//[1]:���� ���� �� �޼��� ȣ��
		//Wrapper Ŭ������ Integer Ŭ���� Ÿ������ ���� a�� �����ϰ�, new�� ��ü�� �����Ͽ� �ش� �ּ� ���� �޼���� ������.
		//new:��ü�� �����ؼ� �װ��� �ּҸ� ��ȯ
		Integer a = new Integer(100);
		sum(a);
		//[2]:��� 
		System.out.println( a);
		
	}
}
