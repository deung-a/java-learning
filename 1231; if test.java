import java.util.Scanner;
//������ �Է¹޾� 50�� �̻��̶�� �հ�, ���б�50���� ����ϱ�
/*
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int score;
		
		System.out.print("����: ");
		score = s.nextInt();
		
		if(score>=70){
			System.out.println("�հ�");
			System.out.println("���б� 100����");
		}else if(score>=50){
			System.out.println("�հ�");
			System.out.println("���б� 100����");
		}else System.out.println("���հ�");
	}
}*/

//���˹���
//2. 3 -> C, 0 -> A, -1 -> C
//3.���� ����� �޾Ƽ� 100ml�̸��� small, 100ml�̻� 200ml�̸��� medium, 200ml �̻��� large��� ����ϴ� �������� if-else ���� �ۼ��Ͻÿ�
/*
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int size;
		System.out.print("���� ������(ml): ");
		size = s.nextInt();
		
		if(size>=200) System.out.println("large");
		else if(size>=100) System.out.println("medium");
		//if ���� size<200�� �͸� �ɷ����⶧���� �ߺ��ؼ� �ۼ����ʿ�x
		else System.out.println("small");
	}
}*/
//�ڵ��� ���� �ʱ� �հ� ����(1���� ��� : 70�� �̻�, 2���� ��� : 60�� �̻�)
/*
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String type;//��������
		int	score;//���ʺ���
		
		System.out.print("������� ��������('1��'�Ǵ� '2��'): ");
		type = s.nextLine();
		System.out.print("�ʱ� ������� ���� �Է�: ");
		score = s.nextInt();
		
	//	!!!���ڿ����� ���Ҷ��� __.equals("")!!!
		if(type.equals("1��")){
			if(score>=70) System.out.println("�հ�");
			else System.out.println("���հ�");
		}else if(type.equals("2��")){
			if(score>=60) System.out.println("�հ�");
			else System.out.println("���հ�");
		}else System.out.println("[�Է¿���]Ÿ���� 1��,2�����θ� �Է����ּ���.");
	}
}*/

// ����ڷκ��� ������ ����(int input)�� �Է� �޾� �� ���� ���� int�� ���� b�� �Ʒ��� ���� �ʱ�ȭ �Ͻÿ�.
//����̸� b�� 1��, �����̸� b�� -1��, 0�̸� b�� 0�� ����.
/*
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int num, b;
		
		System.out.print("num: ");
		num = s.nextInt();
		
		if(num>0) b = 1;
		else if(num == 0) b = 0;
		else b = -1;
	//	!!!�������� else�� ������� �ʴ´ٸ� �������� ���� �ʴ´�!!!
	//	else�� ¦�� ���� ������ if�̴�. �ٸ��� �ϰ������ {}���!
		System.out.printf("���: %d\n", b);
	}
}*/

//���� ���� �Է¹ޱ�: 1(��)2(ȭ),,0(��). ���� ��? �Է¹ޱ�
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int day, after;
		
		System.out.print("���� ����? ");
		day = s.nextInt();
		System.out.print("���� ��? ");
		after = s.nextInt();
		
		System.out.printf("%d�� �Ĵ� %d���� �Դϴ�.\n", after, (day+after)%7);
	}
}