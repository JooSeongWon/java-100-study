package Test;

public class Rotto {
	public static void main(String[] args) {
		
		int[] ball = new int[45]; //�ζ� �� 45�� ����
	
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1; //�ζ� ������ ��ȣ �ٿ���
		}
		
		int tmp = 0; //shuffle�� ���� �� ���� ����
		int lotto = 0; //������ �ζ� �� ��ȣ�� ���� ����
		
		for(int i=0; i<100; i++) {
			lotto = (int)(Math.random() * 45); //0~44�� ������ ���� ����
			tmp = ball[0]; 
			ball[0] = ball[lotto];
			ball[lotto] = tmp; //����ִ� ������ Ȱ���Ͽ� ���� ���´�
		}
		
		for(int i=0; i <6; i++) {
			System.out.print(ball[i] + " / ");
		}
		
		System.out.println("�ζǹ�ȣ ���� �Ϸ�");
		
	}
}
