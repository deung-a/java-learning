//����������: %~. %d, %o, %x(����), %f(�Ǽ�), %c(����), %s(����, ���ڿ�)
//����ڷκ��� ���� �ϳ� �Է¹޾� �״�� ���
import java.util.Scanner;

class FormatSpecifier{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double d;
		
		System.out.printf("%s\n", "Hello.");
		
		System.out.print("�Ǽ�: ");
		d = s.nextDouble();
		
		System.out.printf("�Է��Ͻ� �Ǽ��� %+5.3f�Դϴ�.\n", d);//�Ҽ��� �Ʒ� ��°�ڸ����� ���, %n~; n°ĭ���� ����.
		
		int input;
		
		System.out.print("����: ");
		input = s.nextInt();
		
		System.out.printf("�Է��Ͻ� ������ �������´� %c�Դϴ�.\n", input);
		System.out.println("�Է��Ͻ� ������ " + input + "�Դϴ�.");
		System.out.printf("�Է��Ͻ� ������ %d�Դϴ�.\n", input);
		//%d: decimal(10����)
		/*
		//�Է¹��� ���� 8������ ����ϱ�: %o(octal)
		System.out.printf("�Է��Ͻ� ������ %o�Դϴ�.\n", input);
		//�Է¹��� ���� 16������ ����ϱ�: %x(hexadecimal), %h
		System.out.printf("�Է��Ͻ� ������ %x�Դϴ�.\n", input);
		
		//n�������� ǥ���ϱ�; %#~. (8����: 0__, 16����: 0x__. 10������ ǥ��x)
		System.out.printf("�Է��Ͻ� ������ %d, %1$#o, %1$#x�Դϴ�.\n", input);	
		//���� ������ �ҷ��ö� %n$__: n��° ���ڸ� �ҷ����ڴٴ� �� 
		*/
		
		//����ΰ� 0�϶��� ����� ������� �ʵ��� ����	
		int real, imag;
		
		System.out.print("�Ǽ���: ");
		real = s.nextInt();
		System.out.print("�����: ");
		imag = s.nextInt();
		
		String result = imag==0?String.format("%d", real):String.format("%d %+di", real, imag);
		
		System.out.printf("�Է��Ͻ� ���Ҽ��� %s �Դϴ�.\n", result);
		//%+~ ��ȣ���(10��������)
		
		}
}
/*
//�ڷ�� �� ū �ڷ����� �������� ������ �� �ִ�.
float f = 2.3; 2.3(double��), �ڷ�ս� �߻��ϱ� ������ ������ �Ұ�

float f = 2.3F;
float f = (float)2.3;
//double �� float ������ ����
double d = 2.3;
double d = 2.3f; ������ ����
//int�� double ������ �Ұ�
int i = 2.3; //������ �Ұ�.
*/