//�⵵, �� �Է¹޾� ��ĥ�����ִ��� ����ϱ� (switch�� ����)
import java.util.Scanner;

class DayInMonth{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int year, month = 90, days = 31;
		
		System.out.print("�� ��: ");
		year = s.nextInt();
		
		//���ѹݺ��� while(true){}
		while(true){
			System.out.print("�� ��: ");
			month = s.nextInt();	
			//Ż������
			if(month>0 && month<=12) break;
			System.out.println("[�Է¿���]���� 1��~12�������� ��ȿ�մϴ�. �ٽ� �Է� �ٶ��ϴ�.");
		}
		
	/*	do{
			System.out.print("�� ��: ");
			month = s.nextInt();
			if(month<1 || month>12) System.out.println("[�Է¿���]���� 1��~12�������� ��ȿ�մϴ�. �ٽ� �Է� �ٶ��ϴ�.");
		}while(month<1 || month>12); //dowhile��: ���������ϰ� �����Ǵ��� �ݺ�
	*/
	/*	System.out.print("�� ��: ");
		month = s.nextInt();
		
		while(month<1 || month>12){
			System.out.print("�� ��: ");
			month = s.nextInt();
		}*/
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				break;
			case 4: case 6: case 9: case 11:
				days = 30; break;
			case 2: //���� = 29��, ���� = 400�� ��� �Ǵ� 4�� ����ε� 100�ǹ���� �ƴ� ���
				if(year%400==0 || (year%4==0 && year%100!=0)) days = 29;
				else days = 28;
				break; //�ݺ���, switch�� ����ÿ� ���.
			default:
				System.out.println("[�Է¿���]���� 1��~12�������� ��ȿ�մϴ�.");
				//return; //�Լ�����
				System.exit(0);//���α׷� ����
		}
		System.out.format("%d�� %d��: %d�ϱ��� ����\n", year, month, days);
		
	}
}