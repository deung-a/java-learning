/* �ݺ��� - for��
for(�ʱ�ȭ; �ݺ�����; ������){�ݺ��ҳ���}
for(int i=0; i<n; i++){~}
	-> n�� �ݺ�!
	i�ʱ�ȭ - ������ �����ϴ°�?	- �����ϸ� ���� ���� �� ���� - (�ݺ�)������ �����ϴ°�? -~~
							- ���� ���ϸ� ����
*/
import java.util.Scanner;

class ForTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		//Hello, world! ���� ���
/*		for(int i=0; i<10; i++){
			System.out.println("Hello, world!");			
		}
		//System.out.println(i);//�����Ͽ���(CE): i�� for�� �ȿ����� ��ȿ
*/		
		//* 10�� ���
/*		for(int i=0; i<10; i++) System.out.print("*");
		System.out.println();
		//���η� ���
		for(int i=0; i<10; i++) System.out.println("*");
		//10*5���� ���
		for(int j=0; j<5; j++){
			for(int i=0; i<10; i++) System.out.print("*");
			System.out.println();
		}
*/		
		//1~10���� ����ϱ�
/*		for(int i=0; i<10; i++) System.out.printf("%d ", i);
		System.out.println();
*/		
		//�� �Է¹޾� ������ ����ϱ�
/*		int dan;
		System.out.print("�� ��: ");
		dan = s.nextInt();
		System.out.printf("=====%d��=====\n", dan);
		for(int i=0; i<9; i++) System.out.printf("%d * %d = %d\n", dan, i+1, (i+1)*dan);
		System.out.println();
*/				
		//1~10������ �� ���ϱ�
/*		int sum = 0;
		for(int i=0; i<10; i++){
			sum += i+1;
			System.out.print(i+1);
			if(i<9) System.out.print("+");
		}
		System.out.println(" = "+sum);
*/		
		//n! ���ϱ�(overflow �߻����� �ľ�)
/*		long n, fact = 1, ovflcheck, preFact = fact;
		System.out.print("����: ");
		n = s.nextInt();
		for(int i=1; i<=n; i++){
			fact *= i;
			if(fact/i != preFact){
				System.out.printf("%d!�� ���ϴ� �������� overflow �߻�.", i);
				return;
			}
			preFact = fact;
		}
		System.out.printf("%d! = %d\n", n, fact);
*/		
		//����ڷκ��� a, b�� �Է¹޾� a���� b�� ����� ���(���������� ū��)
/*		int a, b, tmp;
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		if(a>b){tmp = a; a = b; b = tmp;}
		
		for(int j=a; j<=b; j++){
			System.out.printf(j+"�� ����� ");
			for(int i=1; i<j; i++){
				if(j%i==0) System.out.printf(i+" ");
			}
		System.out.println();
		}
*/		
		//*�� �����ﰢ�� ���(��������)
/*		int row;
		System.out.print("�����ﰢ���� ����մϴ�.\n��: ");
		row = s.nextInt();
		
		for(int j=1; j<=row; j++){
			for(int i=1; i<=j; i++) System.out.print("*");
			System.out.println();
		}
*/	
		
		//�����ﰢ�� ���(��������)
/*		System.out.print("�����ﰢ���� ����մϴ�.\n��: ");
		row = s.nextInt();
		
		for(int j=1; j<=row; j++){
			for(int i=0; i<row-j; i++) System.out.print(" ");
			for(int i=1; i<=j; i++) System.out.print("*");
			System.out.println();
		}
*/		
		//�������ﰢ�� ���(��������)
/*		int row;
		System.out.print("�����ﰢ���� ����մϴ�.\n��: ");
		row = s.nextInt();
		
		for(int j=0; j<row; j++){
			for(int i=0; i<j; i++) System.out.print(" ");
			for(int i=0; i<row-j; i++) System.out.print("*");
			System.out.println();
		}*/
			
		//�Ƕ�̵� ���
/*		int row;
		System.out.print("�Ƕ�̵带 ����մϴ�.\n��: ");
		row = s.nextInt();
		
		for(int i=0; i<row; i++){
			//i�� ���
			//���� ���: row-1-i��
			for(int j=0; j<row-1-i; j++) System.out.print(" ");
			//�� ���: 2*i+1��
			for(int j=0; j<2*i+1; j++) System.out.print("*");
			System.out.println();
		}
*/		
		//���Ƕ�̵� ���
		int row;
		System.out.print("�Ƕ�̵带 ����մϴ�.\n��: ");
		row = s.nextInt();
		
		for(int i=0; i<row; i++){
			//i�� ���
			//���� ���: i��
			for(int j=0; j<i; j++) System.out.print(" ");
			//�� ���: 2*row-1-2*i��
			for(int j=0; j<2*row-1-2*i; j++) System.out.print("*");
			System.out.println();
		}
		
		
		//������ n���� ����ϱ�(�Է¹޾Ƽ�) 
		
		
		
		
		
		
	
	}
}