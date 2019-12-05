/*
final	+����/�ʵ�	=> ���ȭ
		+�޼ҵ�	=> ������ �Ұ�
		+Ŭ����	=> ��ӺҰ�


������: �� ��ü�� �������� �ٸ�Ÿ������ �θ��� �ִ°�

-��ĳ����:	�ڽ�Ŭ������ ��ü�� �θ�Ŭ������ ��ü�� ��Ī
 ��) Animal l = new Lion();
	�� ����: �ڽ�Ŭ���� ������ �ʵ峪 �޼ҵ忡�� ���� �Ұ�.
-�ٿ�ĳ����:�θ�Ŭ������ ��ü�� �ڽ�Ŭ������ �����°�
 ��) ((Lion)l).adress- ��ĳ������ ���� �غ�����
	�� ��Ӱ���ƴѰ�� ������� �߻�.!!
*/

/*���Ŭ����
	�ʵ�: �̸�, ����
	������: ��� �ʵ带 �ʱ�ȭ�ϴ� ������
��� �θ� ����.
toString() �޼ҵ� ������: ��� �ʵ� ���� ����
*/
class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return String.format("%s, %d��", name, age);
	}
	//equals(): ������ ��ü���� �Ǵ��� �� �ֵ��� ������
	//�̸��� ���̰� ������ ���� ������� �����ϵ��� ������
	public boolean equals(Object o){
		//o�� ����̸� ĳ�����ؼ� �Ǵ��ϰ�, ����� �ƴ϶�� false ��ȯ
		if(o instanceof Person){
			return (((Person)o).age==this.age && ((Person)o).name.equals(this.name));
		}
		else return false;
		
		/*
		if(((Person)o).age==this.age && ((Person)o).name.equals(this.name)) return true;//ObjectŬ�������� age�� name�� �����Ƿ� �ٿ�ĳ���� �������.
		else return false;*/
	}//�Ű������� person p ���� ���; ���� �Ű������� object obj�� �����Ƿ� ��ǻ� �ߺ�������
	
	
}

//�� Ŭ����
class Stone{
	private String name;
	private int age;
}
//�� ������ p1�� ���� ��ġ�ϴ��� ��� ���
class Ptest{
	public static void main(String [] args){
		Person p1 = new Person("������", 21);
		Person p2 = new Person("������", 21);
		Person p3 = new Person("������", 21);
		Stone s = new Stone();
		System.out.println("p1�� �� ����? "+p1.equals(s));
		//���ܹ߻�. 
		System.out.println("p1�� �� ����? "+s.equals(p1));
		System.out.println("p1, p2 �����ι�? "+p1.equals(p2));
		System.out.println("p1, p3 �����ι�? "+p1.equals(p3));
	}
}
