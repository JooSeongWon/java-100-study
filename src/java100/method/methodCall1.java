package java100.method;

public class methodCall1 {
	
	//[!]:Call by value-->���� ���� ȣ�� -->���� ���ؼ� (�޼��带) ȣ��
	//�޼���� ���ڰ��� �ѱ� �� �ش� ���� �����Ͽ� �ѱ�� ��� -->���� sum()�޼��� ���ο����� ����� ������ ó���� �Ѵ�.
	public static void sum(int a) {
		a += 400;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		//[1]:���� ���� �� �޼��� ȣ��
		int a = 100; //a=100�� �����Ͽ� sum �Ű������� �ѱ�� a�� ���� ������ ����
		sum(a);
		
		//[2]:���
		System.out.println(a);
	}
}
