package java100.method;

public class method_Exam03 {
	
	public static int returnMethod() {
		int ret = 100;
		ret *= 100;
		return ret; //---10000---
	}
	
	public static void main(String[] args) {
	
		//[1]:��ȯ��-->O	�޴� ���ڰ�-->X
		//��ȯ���� �ִٴ� ���� �޼���(�Լ�) ȣ�⿡ ���� ���ϰ��� �ִ� ���̹Ƿ� ȣ��� ���ϰ��� �޴� ������ �����Ѵ�.
		int rst;
		rst = returnMethod();
		
		//[2]:���
		System.out.println("�޼��� ȣ�⿡ ���� ���ϵ� ���� = " + rst);
		
	}
}
