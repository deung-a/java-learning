//Hello, world ����Ϳ� ���
import java.util.Scanner;

class Hello{
	public static void main(String [] args){
		/*
		System.out.printf("Hello, world.\n");//System.out = �����(ǥ�����)
		System.out.println("Hello, world.");//println():�ڵ�����
		System.out.print("Hello, world.");//print() = println()���� ���� ����
		System.out.format("Hello, wolrd.");//format() = printf()
		*/
		
		//����ڿ��� ����, �÷� �Է¹޾� �״�� ���
		Scanner myScanner = new Scanner(System.in);//System.in = Ű����(ǥ���Է�)
		//�ڷ��� �̸� = new Scanner(System.in); ��ĳ�ʸ����.
		
		System.out.print("����: ");
		int age = myScanner.nextInt();
		
		System.out.print("�÷�: ");
		double eye = myScanner.nextDouble();
		
		System.out.printf("�Է��� ���̴� %d��, �÷��� %.1f �Դϴ�.\n", age, eye);
				
		//����(����), �̸�(���ڿ�), �÷�(�Ǽ�) ���
		//f�� ���Ե� �Լ�(printf, format,,)������ %(����������;format specifier)�� ����� �� ����.
		System.out.printf("����: %d��, �̸�: %s, �÷�: %.2f\n", 5, "������", 1.123456);
		System.out.format("����: %d��, �̸�: %s, �÷�: %.2f\n", 5, "������", 1.123456);
		//print()�� �ȵ�..
		
	}
	
}