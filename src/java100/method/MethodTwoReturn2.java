package java100.method;

import java.util.Arrays;

public class MethodTwoReturn2 {
	
	public static String[] capitalMethod(String a, String b) {
		String a_ = a.toUpperCase();
		String b_ = b.toLowerCase();
		
		//���ϰ� 2���� ������ �迭 ���� ����
		String[] ret = {a_,b_};
		return ret;
	}
	
	public static void main(String[] args) {
		
		//[1]:��ȯ��-->0	�޴� ���ڰ�-->O
		//��ȯ���� �ִٴ� ��-->�޼��� ȣ�⿡ ���� ���ϰ��� �ִٴ� ��-->ȣ��ο��� ���ϰ��� �޴� ���� ����
		String[] result = capitalMethod("korea", "USA");
		
		//[2]:���
//		System.out.println(result); //�ּ� �� ���
		System.out.println(result[0]); //KOREA
		System.out.println(result[1]); //usa
		System.out.println(result[0] +" "+ result[1]);
		System.out.println(Arrays.toString(result));
	}
}
