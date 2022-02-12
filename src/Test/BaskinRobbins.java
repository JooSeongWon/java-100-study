package Test;

import java.util.Scanner;

public class BaskinRobbins {

	static Scanner sc = new Scanner(System.in);
	static int meWin = 0;
	static int comWin = 0;
	
	public static void main(String[] args) {
	
		while(true){
			//메뉴
			System.out.println("---Baskin Robbins31 Game ---");
			System.out.println();
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
            System.out.print("\n> ");

            //메뉴 선택 입력
			int menuSelect = sc.nextInt();
			
			//1번 게임 시작
			if(menuSelect == 1) {
				game();
				
			//2번 게임 스코어
			} else if (menuSelect == 2) {
				System.out.println("---SCORE---");
				System.out.println("Me Win: " + meWin);
				System.out.println("Come Win: " + comWin);
				//게임 결과가 없을 때
				if (meWin == 0 && comWin == 0)
					System.out.println("게임 결과가 없음");
			//3번 게임종료
			} else if (menuSelect == 3) {
				System.out.println("게임 끝");
				System.exit(0);
			
			//1~3외 다른 번호 입력 시 경고
			} else {
				System.out.println("Enter correct number please! (1~3)");
			}
			
		}
			
	}
	
	public static void game() {
		System.out.println("---Game Start");
		
		int lastNum = 0;
		
		while(true) {
			
			//사용자 턴
			int userNum = 1;
			
			while(true) {
				
				//1~3 숫자 입력
				System.out.println("나의 턴");
				System.out.print("Input Number (1~3) >>");
				userNum = sc.nextInt();
				
				//1~3번 선택시 스탑
				if(1 <= userNum && userNum <= 3)
					break;
				//1~3외 번호 선택시 경고 -> 다시 위로가서 숫자 입력
				else
					System.out.println("숫자를 제대로 입력하세요. (1~3)");
			}
			
			//숫자 외치기(사람)
			for(int i = (lastNum + 1); i<=lastNum + userNum; i++) {
				
				if(i>31) {
					break;
				}
				System.out.println(i);
			}
			
			lastNum += userNum;
			
			if (lastNum >= 31) {
				System.out.println("패배");
				comWin++;
				break;
			}
			
			System.out.println();
			
			//컴퓨터 턴
			System.out.println("컴퓨터 턴");
			
			int comNum = 0;
			
			if (lastNum == 27)
				comNum = 3;
			else if (lastNum == 28)
				comNum = 2;
			else if (lastNum == 29)
				comNum = 1;
			else
				comNum = (int)(Math.random() * (3 - 1 + 1) + 1); //1~3
			
			//숫자 외치기(컴퓨터)
			for(int i = (lastNum + 1); i<=lastNum + comNum; i++) {
				
				if(i>31) {
					break;
				}
				System.out.println(i);
			}	
				System.out.println();
			
			lastNum += comNum;
			
			if(lastNum >=31) {
				System.out.println("승리");
				meWin++;
				break;
			}
		}	
	}
}
