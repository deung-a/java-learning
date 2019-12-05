/*상속 Superclass > Subclass
자식클래스가 상속 받을때; class Subclass extends Superclass;

-기존클래스의 필드와 메소드를 재사용, 일부 변경도 가능. -> 중복을 줄인다

예)	탈것(부모클래스;superclass) 안에 직진, 좌, 우회전 있음.
	자전거, 자동차, 기차 클래스(자식클래스;subclass)가 탈것의 속성을 받을때.

접근지시자: 멤버(method, field) 앞에 기술
- public	: 모든곳에서 접근(사용)가능
- protected	: 해당 폴더(패키지) 내부+ 자식클래스에서 접근가능
- (default)	: 해당 폴더 내부에서만 접근가능 
- private	: 본인클래스 내부에서만 접근가능

예)
패키지1{
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
		b;	(X) -> private은 상속을 받긴 하지만 사용을 못함.
	}
	class C{
		a, s, d 사용하려면 객체선언 후 객체.a; 객체.s; 객체.d;
	}
}
패키지2{
	class D{
		a;	(O)
		s;	(O)
		d;	(X)
		b;	(X)
	}
	class E{
		a 사용하려면 객체선언 후 객체.a;
	}
}


*/
import java.util.*;

//1. class Fish, Lion, Bird: move() 메소드 - 나는 움직입니다.
/*	
	3개의 필드를 모두 초기화시키는 생성자 작성

	Fish: 나이, 이름, 어종
	Lion: 나이, 이름, 사는곳
	Bird: 나이, 이름, 날개색상
*/
//2. 생성자: 각 클래스에서 디폴트 생성자 작성, "동물/물고기/사자/새 생성" 출력
class Animal{
	int age;
	String name;
	Animal(int age, String name){
		this.age = age;
		this.name = name;
		System.out.printf("나이가 %s세, 이름이 %s인 동물 생성\n", age, name);
	}
	Animal(){
		System.out.println("동물 생성");
	}
	void move(){
		System.out.printf("나는 %s, 움직입니다.\n", getClass().getName());
	}
}

class Fish extends Animal{
	String type;
	Fish(int age, String name, String type){
	/*	this.age = age;
		this.name = name;*///부모클래스에서 선언한 필드는 부모클래스에서 초기화하도록 함.
		super(age, name);
		this.type = type;
		
		System.out.printf("어종: %s인 물고기 생성\n", this.type);
	}
	Fish(){
		//항상 어떤 생성자가 호출 되면 맨 윗줄에 부모 클래스의 생성자가 호출 되어야 함.
		//부모 클래스의 생성자를 호출하지 않는다면 자동으로 부모 클래스의 디폴트 생성자가 호출됨.
		super();//부모클래스는 super로 부른다.
		System.out.println("물고기 한마리 생성");
	}
	
	//@Override = 재정의: 부모클래스로부터 물려받은 메소드를 자식클래스에 맞게 수정
	//중복정의: overload
	@Override
	//@Override 쓰는 이유: 컴파일할때 함수이름 잘못친거(실수한거) 알려줌.
	void move(){
		super.move();//부모클래스 내용 그대로 사용하고 내가 추가할때
		System.out.println("나는 헤엄칩니다~(^3");
	}
	
	//toString()재정의: 어종, 이름, 나이 정보 반환하도록 재정의
	@Override
	public String toString(){
		return String.format("어종: %s, 이름: %s, 나이: %d인 물고기", type, name, age);
	}
	
}//Lion move() 재정의: 나는 달립니다
class Lion extends Animal{
	Lion(){
		String address;
		System.out.println("사자 한마리 생성");
	}
	@Override
	void move(){
		super.move();//넣어도되고 안넣어도됨. 넣으면 부모클래스의 것 까지 출력.
		System.out.println("나는 뛰어댕깁니다^ㅅ^~");	
	}
}//Bird move() 재정의: 나는 날아다닙니다
class Bird extends Animal{
	Bird(){
		String color;
		System.out.println("새 한마리 생성");
	}
	@Override
	void move(){
		super.move();
		System.out.println("나는 날아댕깁니다 <^~~");
	}
}

class AnimalTest{
	public static void main(String [] args){
		Fish f = new Fish(5, "니모", "흰동가리");
		System.out.println(f.getClass());//f객체가 어떤 클래스로부터 생성되었는지 반환
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

/*Object class; origin of all classes 클래스 계층구조의 맨위
	ㄴ 여기있는 메소드는 재정의하지 않아도 사용할 수 있다.
메소드;	getClass(): 객체를 생성한 클래스 정보를 반환한다.
		equals(Object obj): obj가 이 객체와 같은지를 나타낸다.
		toString(): 객체의 문자열 표현을 반환한다.
		
equals와 toString은 꼭 재정의(override) 해줘야한다.
부모클래스가 정해놓은 접근권한(접근지시자)을 좁히는것 불가능하다. Object클래스의 메소드 재정의할때는 public 붙여줘야함.!!
예) public> public (o), public>(default) (x), (default)>public (o)

*/