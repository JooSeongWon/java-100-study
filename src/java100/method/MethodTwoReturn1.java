package java100.method;

import java.util.Arrays;

public class MethodTwoReturn1 {

	public static int[] testMethod() {
		int num1 = 100;
		int num2 = 200;
		return new int[] {num1, num2};
	}
	
	public static void main(String[] args) {
		
		//[1]:�迭 ���� ���� -->�޼���� ���� ��ȯ���� ���� �迭�̱� ������
		int result[] = testMethod();
		
		//[2]:���
		System.out.println(result[0] +"-"+ result[1]); //���� ���
		System.out.println(result[0] + result[1]); //300
		System.out.println(result); //�ּ� �� ���
		System.out.println(Arrays.toString(result)); //�ѹ濡 ��� ��� ���-->�ݺ��� ����
	}
}
