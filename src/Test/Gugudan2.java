package Test;

//������ 3�ܿ��� 4�� ��� �����ϰ� ���
public class Gugudan2 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1; i<=9; i++) {
			if(!((3*i) % 4 == 0)) {
				count++;
				System.out.println("4�� ����� ������ 3�� : " + 3*i);
			}
		}
		System.out.println("�� ���� : " + count);
	}
}
