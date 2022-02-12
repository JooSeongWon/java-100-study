package Test;

public class Rotto {
	public static void main(String[] args) {
		
		int[] ball = new int[45]; //로또 공 45개 생성
	
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1; //로또 공마다 번호 붙여줌
		}
		
		int tmp = 0; //shuffle을 위한 빈 공간 생성
		int lotto = 0; //랜덤한 로또 공 번호를 위해 생성
		
		for(int i=0; i<100; i++) {
			lotto = (int)(Math.random() * 45); //0~44의 임의의 값을 구함
			tmp = ball[0]; 
			ball[0] = ball[lotto];
			ball[lotto] = tmp; //비어있는 변수를 활용하여 공을 섞는다
		}
		
		for(int i=0; i <6; i++) {
			System.out.print(ball[i] + " / ");
		}
		
		System.out.println("로또번호 추출 완료");
		
	}
}
