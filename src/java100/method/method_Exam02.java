package java100.method;

public class method_Exam02 {
	
	public static void plusMethod(int a, int b) {
		//�ܼ� ���
		System.out.printf("���ڷ� �Ѱܹ��� 2���� ���� %d�� %d�Դϴ�.",a,b);
		
		//���� ���
		int rst = a+b;
		System.out.println("�� ���� ���� ���� =" + rst);
	}
		
		
	public static void main(String[] args) {
		
		//[1]:��ȯ��-->X	�޴� ���ڰ�-->O
		//�޼��尡 �޴� ���ڰ��� �ִٴ� ���� ȣ��ο��� �Ķ���� ���� �ѱ�ٴ� ��.
		int a = 100, b = 200;
		plusMethod(a,b);
		
	}
}
