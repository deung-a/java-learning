import java.util.*;
/**���� ����
	RuntimeException(;unchecked exception)-�������� �Ǵµ� ���ܹ߻�
	�׿�:PrintWriter()Scanner(f)..(;checked exception)-�����Ϸ��� ���� �ɷ���
*/
class ExceptionTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		//���� 2�� �Է¹޾Ƽ� a/b������
		int a, b;
		System.out.print("���� a: ");
		a = s.nextInt();
		System.out.print("���� b: ");
		b = s.nextInt();
		
	/*	try{
			System.out.println("a/b = "+a/b);//����(������Ȳ) ó���� ����
		//���1: ���� ���� ó�� : try{-}catch(Exception e){}
		//	���Ϲ������� ����� ��������� ���ܰ� �߻��� ���� �ִ� �ڵ忡 ���
		//���2: ���ѱ��  ��� : throws Exception(��ü:�޼ҵ�, �Լ���°�� ����ó��.)
		//	��main�� ���°� ����..!(�׽�Ʈ��).����������.
		}catch(ArithmeticException ae){//catch(� ���ܸ� ���� ������ ����){}
			System.out.println("�ι�° ������ 0�� �ƴ� ���� �Է��ؾ� �մϴ�.");
		}
		
		System.out.println("������ ���α׷�");
		//'0'���� �̻��� ���� �޾����� ���� �ڵ尡 ��������ʰ� ������������ �����.
		//ArithmeticException�� �߻�; �ݺ����� ���� ó���������.
		//���ܰ� �������� ��� try{}catch(){}...catch(){}finally{}
		//finally���: �����߻��� ������� �׻� ����Ǿ�� �ϴ� �ڵ忡 ���. ��������
		*/
		
		//a/b�� ��ȯ�ϴ� �޼ҵ� �ۼ� �� �׽�Ʈ
		try{
			System.out.println("a/b = "+division(a,b));
			//31���ο��� 37��°������ �����ϸ鼭 ���ܹ߻�.
		}catch(ArithmeticException ae){
			System.out.println("�ι�° ������ 0�� �ƴ� ���� �Է��ؾ� �մϴ�.");
			ae.printStackTrace();//�׽�Ʈ�� ���α׷� �ۼ��ÿ� ���.
		}
		System.out.println("������ ���α׷�");
	}
	
	static int division(int a, int b) throws ArithmeticException{
		return a/b;
	}
}

/*����Ŭ����
Object	-Throwable	-Exception	-ClassNotFoundException
								-IOException
								-RuntimeErrorException	-ArithmeticException
														-NullPointerException
														-IndexOutOfBoundsException
														-IllegalArgumentException
														...
								...
					-Error(����x)-LinkageError
								-VirtualMachineError
								...
���ܿ� ������ ����;
Exception	-IOException
			-NumberException-TooBigException
							-TooSmallException
*/

//����, �̸� �Է¹޾� �״�� ����ϴ� �޼ҵ� ����� �׽�Ʈ
class InputExceptionTest{
	public static void main(String [] args){
		try{
			input();
		}catch(NegativeAgeException nae){
			System.out.println("[�Է¿���]���̴� �ƶ��Ƽ��ڷ� �Է¹ٶ��ϴ�.");
			nae.printStackTrace();
		}
	}
	static void input() throws NegativeAgeException{
		Scanner s = new Scanner(System.in);
		int age;
		String name;
//���̸� �ѱ۷� �Է����� �� �߻��ϴ� ���ܸ� ��Ƽ� ó��(���̴� �ƶ��Ƽ��ڷ� �Է¹ٶ��ϴ�.)�Ͻÿ�
		try{
			System.out.print("�̸�: ");
			name = s.next();
			System.out.print("����: ");
			age = s.nextInt();
			if(age<0) throw new NegativeAgeException();
			//throw; JVM���� ���ܰ�ü�� �����Ǿ����� �˸��� Ű����
			//XD.java:83: error: unreported exception NegativeAgeException; must be caught or declared to be thrown �������̾ȵ�.!! catch�ϰų� throws�������
			System.out.println(age+"�� "+name);
		}catch(InputMismatchException ime){//util��Ű���� Ŭ������. import����� �νİ���
			System.out.println("[�Է¿���]���̴� �ƶ��Ƽ��ڷ� �Է¹ٶ��ϴ�.");
		}
	}
}
//����� ���� ����; Exception class�� ��ӹ޾������
//���� ���� ����; ����ڰ� ���̸� ������ �Է��� ��� �߻��ϴ� ����
class NegativeAgeException extends Exception{
	//���ܿ� ���� ������ ���
	NegativeAgeException(){
		super("�������̿���");
	}
}