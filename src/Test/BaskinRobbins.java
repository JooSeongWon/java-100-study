package Test;

import java.util.Scanner;

public class BaskinRobbins {

	static Scanner sc = new Scanner(System.in);
	static int meWin = 0;
	static int comWin = 0;
	
	public static void main(String[] args) {
	
		while(true){
			//�޴�
			System.out.println("---Baskin Robbins31 Game ---");
			System.out.println();
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
            System.out.print("\n> ");

            //�޴� ���� �Է�
			int menuSelect = sc.nextInt();
			
			//1�� ���� ����
			if(menuSelect == 1) {
				game();
				
			//2�� ���� ���ھ�
			} else if (menuSelect == 2) {
				System.out.println("---SCORE---");
				System.out.println("Me Win: " + meWin);
				System.out.println("Come Win: " + comWin);
				//���� ����� ���� ��
				if (meWin == 0 && comWin == 0)
					System.out.println("���� ����� ����");
			//3�� ��������
			} else if (menuSelect == 3) {
				System.out.println("���� ��");
				System.exit(0);
			
			//1~3�� �ٸ� ��ȣ �Է� �� ���
			} else {
				System.out.println("Enter correct number please! (1~3)");
			}
			
		}
			
	}
	
	public static void game() {
		System.out.println("---Game Start");
		
		int lastNum = 0;
		
		while(true) {
			
			//����� ��
			int userNum = 1;
			
			while(true) {
				
				//1~3 ���� �Է�
				System.out.println("���� ��");
				System.out.print("Input Number (1~3) >>");
				userNum = sc.nextInt();
				
				//1~3�� ���ý� ��ž
				if(1 <= userNum && userNum <= 3)
					break;
				//1~3�� ��ȣ ���ý� ��� -> �ٽ� ���ΰ��� ���� �Է�
				else
					System.out.println("���ڸ� ����� �Է��ϼ���. (1~3)");
			}
			
			//���� ��ġ��(���)
			for(int i = (lastNum + 1); i<=lastNum + userNum; i++) {
				
				if(i>31) {
					break;
				}
				System.out.println(i);
			}
			
			lastNum += userNum;
			
			if (lastNum >= 31) {
				System.out.println("�й�");
				comWin++;
				break;
			}
			
			System.out.println();
			
			//��ǻ�� ��
			System.out.println("��ǻ�� ��");
			
			int comNum = 0;
			
			if (lastNum == 27)
				comNum = 3;
			else if (lastNum == 28)
				comNum = 2;
			else if (lastNum == 29)
				comNum = 1;
			else
				comNum = (int)(Math.random() * (3 - 1 + 1) + 1); //1~3
			
			//���� ��ġ��(��ǻ��)
			for(int i = (lastNum + 1); i<=lastNum + comNum; i++) {
				
				if(i>31) {
					break;
				}
				System.out.println(i);
			}	
				System.out.println();
			
			lastNum += comNum;
			
			if(lastNum >=31) {
				System.out.println("�¸�");
				meWin++;
				break;
			}
		}	
	}
}
