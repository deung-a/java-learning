import java.util.Scanner;
//������: ��ü�� ������ �� �ʵ带 �ʱ�ȭ�ϴ� Ư���� �޼ҵ�

/* 	�ڵ��� Ŭ���� �ʵ� �߰�; �귣��, ����, ����
	������; �귣��,������ �޾� �ʱ�ȭ�ϴ� ������
*//*
�޼ҵ� �ñ״�ó(signature) = �޼ҵ��̸�+�Ű�����
�ñ״�ó�� �ٸ� �Լ��� ���� ����: ��, �̸��� ������ �Ű������� �ٸ��ٸ� �ߺ����� ����, ��ȯŸ���� �ٸ��� �Ұ���.
�޼ҵ� �ߺ�����: method overloading
��)	void add(int a, int b){}, void add(int a, int b, int c){} ==> ����
	int add(int a, int b){}, void add(int a, int b) ==> �Ұ���!!
*/

//�ڵ��� �׽�Ʈ
class Car{
	private int mileage;//����Ÿ�
	private String brand;
	private int year;
	private String color;
	
	//������; main�Լ����� ��ü �����Ҷ� �ʱ�ȭ�ϰ� ����.
	Car(String brand, int year){
		this.brand = brand;
		this.year = year;	
	}
	//�귣��, ����, ������ �޾� �ʱ�ȭ�ϴ� ������
	Car(String brand, int year, String color){
/*		this.brand = brand;
		this.year = year;*/
		this(brand, year);//�� Ŭ������ ������ �θ��� this��� ǥ�ð���
		this.color = color;
	}
	//����Ʈ ������: �Ű������� �ϳ��� ���� �⺻������
	Car(){
		//2019��� ���� ���� ����
		this("����", 2019, "silver");
	}
	
	//!!!toString(): ��ü�� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�.!!!�߿�
	//"�� �ڵ����� **��� **�� **�ڵ����Դϴ�." ������ ��ȯ�ϴ� �޼ҵ�
	public String toString(){
		return String.format("�� �ڵ����� %s�� %d��� %s�� �ڵ����Դϴ�.", brand, year, color);
	//	return "�� �ڵ����� "+brand+"�� "+year+"��� "+color+"�� �ڵ����Դϴ�.";
	}
	
	//add �޼ҵ�: �� ������ �Ű������� �޾� �� ������ ���� ��ȯ�ϴ� �Լ�
	int add(int a, int b){
		return a+b;		
	}
	//add �޼ҵ�: �� ������ �Ű������� �޾� �� ������ ���� ��ȯ�ϴ� �Լ�
	int add(int a, int b, int c){
	//	return a+b+c;
		return this.add(this.add(a,b),c);//���⼭�� this ���� �Ⱥٿ��� �Ǳ� ��.
	}
	
	//�����ϴ� �޼ҵ�
	public void goStraight(int distance){
		System.out.println(distance+"m �����߽��ϴ�.");
		mileage += distance;
	}	
	public void turnLeft(){
		System.out.print("��ȸ�� �� ");
	}
	public void turnRight(){
		System.out.print("��ȸ�� �� ");
	}
	public int getMileage(){
		return mileage;
	}
}

class Driver{
	public static void main(String [] args){
		Car myCar = new Car("���� �ڵ���", 2019);
		Car yourCar = new Car("������Ƽ", 2018, "black");
		Car c = new Car();
		
		System.out.println(yourCar);//��ü�̸��� ��� toString�޼ҵ带 ����� �Ͱ� �������!!!!
		System.out.println(yourCar.toString());
		System.out.println(c.toString());
		
		System.out.println(c.add(3,4));
		System.out.println(c.add(1,2,3));
		
		myCar.goStraight(25);
		myCar.turnLeft();
		myCar.goStraight(30);
		myCar.turnRight();
		myCar.goStraight(15);
		myCar.turnLeft();
		myCar.goStraight(20);
		System.out.println("�� ����Ÿ��� "+myCar.getMileage()+"m �Դϴ�.");
	}	
}

//HW6 Elevator, ElevatorTest
class Elevator{
	private int floor;
	private boolean door = true;
	
	void open(){
		door = true;
		System.out.println("���� �����ϴ�.");
	}
	void close(){
		door = false;
		System.out.println("���� �����ϴ�.");
	}
	void report(){
		if(floor==0) System.out.println("�κ� �Դϴ�.");
		else if(floor<0) System.out.println("B"+Math.abs(floor)+"�� �Դϴ�.");
		else System.out.println(floor+"�� �Դϴ�.");
	}
	void move(int floor){
		if(floor<-2 || floor>10){
			System.out.println("��ȿ�� ������ �Է����ּ���(-2 ~ 10��)");
			return;
		}
		else if(this.floor<floor){
			close();
			try{
				for(;this.floor<floor;){
					this.floor++;
					report();
					Thread.sleep(1000);
				}
			}catch(Exception e){
				System.out.println("���ܹ߻�");
			}
			open();
		}
		else{
			close();
			try{
				for(;this.floor>floor;){
					this.floor--;
					report();
					Thread.sleep(1000);
				}
			}catch(Exception e){
				System.out.println("���ܹ߻�");
			}
			open();
		}
	}
}

class ElevatorTest{
	public static void main(String [] args){
		Elevator e = new Elevator();
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ��: ");
		e.move(s.nextInt());
		System.out.print("�� ��: ");
		e.move(s.nextInt());
		System.out.print("�� ��: ");
		e.move(s.nextInt());
		
	}
}

class ThreadTest{
	public static void main(String [] args)/*throws Exception==>���� �߻��ϸ� �ѱ�ڴ�.*/{
		//Ȥ�� try{~Thread.sleep(~)}catch(Exception e){~}
		try{
			for(int i=1; i<=10; i++){
				System.out.print(i+" ");
				Thread.sleep(1000);//1�ʾ� ����.
			}
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
	}
}

/*
�߰����˹���
1. ��ü���� ����� ���赵�� �ش�Ǵ� ���� _____________�̴�.
- Ŭ����
2. ���� ������ ��ü�� ���� �� ������ �� �� ��ü�� �ʵ�� �޼ҵ�� �����Ǵ°�? �ƴϸ� �� ��ü���� ������ ��������°�?
- �ʵ�� ������, �޼ҵ�� ������.
3. Ŭ���� ���� �ÿ� Ŭ���� �ȿ� ���ԵǴ� ���� _____�� ______�̴�.
- �ʵ�(�Ӽ�), �޼ҵ�(�Լ�)
4. ��ü�� ����� �����ϴµ� ���Ǵ� �����ڴ� ________�̴�.
- ��Ʈ(.)
5. �� ��ü���� ������ ������ �ִ� ���� Ŭ������ _________�̴�.
- �ʵ�
6. ��ǰ�� ��� ��Ÿ���� Ŭ������ �ۼ��Ͽ� ����. Ŭ���� �ȿ� ��ǰ ��ȣ, �������� �ʵ�� ����ǰ� ��� ����, �����ϴ� �޼ҵ带 �ۼ��Ͽ� ����.

�޼ҵ�: �Է��� �޾Ƽ� ó���� �ϰ� ��� ��ȯ�ϴ� ��
- ��ȯŸ�� �޼ҵ��(�Ű�����), ��ȯ���� ���� ��� ��ȯŸ�� void
- �Է°�(����)->�Ű������� ����, �����(��ȯ��);return ��

�߰����˹���2
1. ���� ������ ���� ������ �������� �����ΰ�?
- ���ʺ���;���� ���� ����Ǵ°�, ��������;������(�ּҰ�)�� �����.
2. �ϳ��� ���� ������ �ٸ� ���� ������ ���ԵǸ� � ���� �߻��ϴ°�?
- �����ִ� ������ ������. myCar=yourCar �ϸ� myCar=null�� ����.
3. ��ü�� �Ҹ��Ű���� ��� �ϸ� �Ǵ°�?
-
*/