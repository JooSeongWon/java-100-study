package java100.method;

//static -->Ŭ������.�޼����();
public class ExamStatic2 {

	public void helloWorld() {
		System.out.println("HEllo, World");
	}
	
	public static void main(String[] args) {
		
		//[1]:�޼��� ȣ��
		//helloWorld(); //---���� �޼���� static�޼��常 ȣ���� �� �ֱ� ������ ���� --;;
		
		//[2]:��ü ���� �� �޼��� ȣ��
		ExamStatic2 es = new ExamStatic2();
		
		es.helloWorld();
	}
}
