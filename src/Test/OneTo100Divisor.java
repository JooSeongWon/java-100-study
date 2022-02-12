package Test;

//1~100 약수 구하기
public class OneTo100Divisor {
	public static void main(String[] args) {
		
		//1~100까지의 수
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " 의 약수 : ");
			
			//j가 i수보다 작거나 같을 때의 수
			for(int j = 1; j <=i; j++) {
				
				//i를 j로 나눌 때 몫이 0인 수 출력
				if(i % j == 0) {
					System.out.print(j + " , ");
				}
			}
			System.out.println();
		}
	}
}
