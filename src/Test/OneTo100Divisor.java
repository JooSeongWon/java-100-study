package Test;

//1~100 ��� ���ϱ�
public class OneTo100Divisor {
	public static void main(String[] args) {
		
		//1~100������ ��
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " �� ��� : ");
			
			//j�� i������ �۰ų� ���� ���� ��
			for(int j = 1; j <=i; j++) {
				
				//i�� j�� ���� �� ���� 0�� �� ���
				if(i % j == 0) {
					System.out.print(j + " , ");
				}
			}
			System.out.println();
		}
	}
}
