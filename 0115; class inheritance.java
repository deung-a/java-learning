/*��� Superclass > Subclass
�ڽ�Ŭ������ ��� ������; class Subclass extends Superclass;

-����Ŭ������ �ʵ�� �޼ҵ带 ����, �Ϻ� ���浵 ����. -> �ߺ��� ���δ�

��)	Ż��(�θ�Ŭ����;superclass) �ȿ� ����, ��, ��ȸ�� ����.
	������, �ڵ���, ���� Ŭ����(�ڽ�Ŭ����;subclass)�� Ż���� �Ӽ��� ������.

����������: ���(method, field) �տ� ���
- public	: �������� ����(���)����
- protected	: �ش� ����(��Ű��) ����+ �ڽ�Ŭ�������� ���ٰ���
- (default)	: �ش� ���� ���ο����� ���ٰ��� 
- private	: ����Ŭ���� ���ο����� ���ٰ���

��)
��Ű��1{
	class A{
		public int a;
		protected String s;
		double d;
		private boolean b;
	}
	class B extends A{
		a;	(O)
		s;	(O)
		d;	(O)
		b;	(X) -> private�� ����� �ޱ� ������ ����� ����.
	}
	class C{
		a, s, d ����Ϸ��� ��ü���� �� ��ü.a; ��ü.s; ��ü.d;
	}
}
��Ű��2{
	class D{
		a;	(O)
		s;	(O)
		d;	(X)
		b;	(X)
	}
	class E{
		a ����Ϸ��� ��ü���� �� ��ü.a;
	}
}


*/
import java.util.*;

//1. class Fish, Lion, Bird: move() �޼ҵ� - ���� �����Դϴ�.
/*	
	3���� �ʵ带 ��� �ʱ�ȭ��Ű�� ������ �ۼ�

	Fish: ����, �̸�, ����
	Lion: ����, �̸�, ��°�
	Bird: ����, �̸�, ��������
*/
//2. ������: �� Ŭ�������� ����Ʈ ������ �ۼ�, "����/�����/����/�� ����" ���
class Animal{
	int age;
	String name;
	Animal(int age, String name){
		this.age = age;
		this.name = name;
		System.out.printf("���̰� %s��, �̸��� %s�� ���� ����\n", age, name);
	}
	Animal(){
		System.out.println("���� ����");
	}
	void move(){
		System.out.printf("���� %s, �����Դϴ�.\n", getClass().getName());
	}
}

class Fish extends Animal{
	String type;
	Fish(int age, String name, String type){
	/*	this.age = age;
		this.name = name;*///�θ�Ŭ�������� ������ �ʵ�� �θ�Ŭ�������� �ʱ�ȭ�ϵ��� ��.
		super(age, name);
		this.type = type;
		
		System.out.printf("����: %s�� ����� ����\n", this.type);
	}
	Fish(){
		//�׻� � �����ڰ� ȣ�� �Ǹ� �� ���ٿ� �θ� Ŭ������ �����ڰ� ȣ�� �Ǿ�� ��.
		//�θ� Ŭ������ �����ڸ� ȣ������ �ʴ´ٸ� �ڵ����� �θ� Ŭ������ ����Ʈ �����ڰ� ȣ���.
		super();//�θ�Ŭ������ super�� �θ���.
		System.out.println("����� �Ѹ��� ����");
	}
	
	//@Override = ������: �θ�Ŭ�����κ��� �������� �޼ҵ带 �ڽ�Ŭ������ �°� ����
	//�ߺ�����: overload
	@Override
	//@Override ���� ����: �������Ҷ� �Լ��̸� �߸�ģ��(�Ǽ��Ѱ�) �˷���.
	void move(){
		super.move();//�θ�Ŭ���� ���� �״�� ����ϰ� ���� �߰��Ҷ�
		System.out.println("���� ���Ĩ�ϴ�~(^3");
	}
	
	//toString()������: ����, �̸�, ���� ���� ��ȯ�ϵ��� ������
	@Override
	public String toString(){
		return String.format("����: %s, �̸�: %s, ����: %d�� �����", type, name, age);
	}
	
}//Lion move() ������: ���� �޸��ϴ�
class Lion extends Animal{
	Lion(){
		String address;
		System.out.println("���� �Ѹ��� ����");
	}
	@Override
	void move(){
		super.move();//�־�ǰ� �ȳ־��. ������ �θ�Ŭ������ �� ���� ���.
		System.out.println("���� �پ���ϴ�^��^~");	
	}
}//Bird move() ������: ���� ���ƴٴմϴ�
class Bird extends Animal{
	Bird(){
		String color;
		System.out.println("�� �Ѹ��� ����");
	}
	@Override
	void move(){
		super.move();
		System.out.println("���� ���ƴ��ϴ� <^~~");
	}
}

class AnimalTest{
	public static void main(String [] args){
		Fish f = new Fish(5, "�ϸ�", "�򵿰���");
		System.out.println(f.getClass());//f��ü�� � Ŭ�����κ��� �����Ǿ����� ��ȯ
		System.out.println(f.toString());
		System.out.println(f);
		f.move();
	//	Fish f = new Fish();
		Lion l = new Lion();
		l.move();
		Bird b = new Bird();
		b.move();
		
	}
}

/*Object class; origin of all classes Ŭ���� ���������� ����
	�� �����ִ� �޼ҵ�� ���������� �ʾƵ� ����� �� �ִ�.
�޼ҵ�;	getClass(): ��ü�� ������ Ŭ���� ������ ��ȯ�Ѵ�.
		equals(Object obj): obj�� �� ��ü�� �������� ��Ÿ����.
		toString(): ��ü�� ���ڿ� ǥ���� ��ȯ�Ѵ�.
		
equals�� toString�� �� ������(override) ������Ѵ�.
�θ�Ŭ������ ���س��� ���ٱ���(����������)�� �����°� �Ұ����ϴ�. ObjectŬ������ �޼ҵ� �������Ҷ��� public �ٿ������.!!
��) public> public (o), public>(default) (x), (default)>public (o)

*/