package java100.method;

public class method_Exam04 {
	
	public static String capitalMethod(String str) {
		//���ڿ� ���� ����
		String ret = str.toUpperCase(); //toUpperCase() --> �ҹ��ڸ� �빮�ڷ� �ٲٴ� �޼���
		return ret;
	}
	
	public static void main(String[] args) {
		
		//[1]:��ȯ��-->O	�޴� ���ڰ�-->O
		//���ڿ� ���� ����
		String rst;
		rst = capitalMethod("korea");
		
		//[2]:���
		System.out.println("�Է��� �ҹ����� �빮�ڴ�=" + rst);
	}
}
