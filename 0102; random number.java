//randomŬ����? java.util.random;
/*
nextDouble() : Math.random()���� 0����x (0.0<__<1.0)
nextInt() : -2^31 ~ 2^31-1 �� ������ �����ѹ� ����
nextInt(int n) : 0���� n-1 ������ ������ �����ѹ� ����
*/

import java.util.*;//java.util ��Ű���� ��� Ŭ������ import
/*
import java.util.Random; //lang��Ű���� �ƴϹǷ� import�������.
import java.util.Scanner;
*/

class RNTest{
	public static void main(String [] args){
		Random r = new Random();//���� ������ ����. ��ĳ��Ŭ������ ���?
		
/*	//	*RandomŬ���� ����Ͽ� ��������*

		//�Ǽ��� ���� ���� �� ���
		System.out.println("�Ǽ��� ����: " + r.nextDouble());//~Math.random()�� ����
		//������ ���� ���� �� ���
		System.out.println("������ ����: " + r.nextInt());
		//0~7 ������ ���� ���� �� ���
		System.out.println("������ ����: " + r.nextInt(8));
		*/
	//	*���� ���� ����*
		Scanner s = new Scanner(System.in);
		int input, answer = r.nextInt(100);
		
		System.out.print("���ڸ� ���� ������(0~100): ");
		input = s.nextInt();
		
		if(input>answer) System.out.printf("���亸�� ũ�׿�. ���� : %d\n", answer);
		else if(input==answer) System.out.printf("%d : �����Դϴ�!!\n", answer);
		else System.out.printf("���亸�� �۳׿�. ���� : %d\n", answer);
	}
}