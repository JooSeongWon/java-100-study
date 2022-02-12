package Test;

//1~100 합 구하기
public class OneTo100Sum {

	public static void main(String[] args) {	
	
		int i = 1;
		int sum = 0;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
