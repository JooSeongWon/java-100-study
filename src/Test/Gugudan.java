package Test;

public class Gugudan {
	public static void main(String[] args) {
		
		//2~9´Ü
		for(int i=2; i<=9; i++) {
			
			//1~9°ö
			for(int j=1; j<=9; j++) {
				
				//ixj=(ixj)
				System.out.println(i + "x" + j + "=" + i * j);
			}
			
			System.out.println();
		}
	}
}
