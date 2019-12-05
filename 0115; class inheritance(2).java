/*
final	+변수/필드	=> 상수화
		+메소드	=> 재정의 불가
		+클래스	=> 상속불가


다형성: 한 객체를 여러가지 다른타입으로 부를수 있는것

-업캐스팅:	자식클래스의 객체를 부모클래스의 객체로 지칭
 예) Animal l = new Lion();
	ㄴ 제약: 자식클래스 고유의 필드나 메소드에는 접근 불가.
-다운캐스팅:부모클래스의 객체를 자식클래스로 내리는것
 예) ((Lion)l).adress- 업캐스팅의 제약 극복가능
	ㄴ 상속관계아닌경우 실행오류 발생.!!
*/

/*사람클래스
	필드: 이름, 나이
	생성자: 모든 필드를 초기화하는 생성자
사람 두명 생성.
toString() 메소드 재정의: 모든 필드 정보 제공
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
		return String.format("%s, %d세", name, age);
	}
	//equals(): 동일한 객체인지 판단할 수 있도록 재정의
	//이름과 나이가 같으면 같은 사람으로 간주하도록 재정의
	public boolean equals(Object o){
		//o가 사람이면 캐스팅해서 판단하고, 사람이 아니라면 false 반환
		if(o instanceof Person){
			return (((Person)o).age==this.age && ((Person)o).name.equals(this.name));
		}
		else return false;
		
		/*
		if(((Person)o).age==this.age && ((Person)o).name.equals(this.name)) return true;//Object클래스에는 age나 name이 없으므로 다운캐스팅 해줘야함.
		else return false;*/
	}//매개변수로 person p 받은 경우; 원래 매개변수로 object obj를 받으므로 사실상 중복정의임
	
	
}

//돌 클래스
class Stone{
	private String name;
	private int age;
}
//돌 생성후 p1과 돌이 일치하는지 결과 출력
class Ptest{
	public static void main(String [] args){
		Person p1 = new Person("김지현", 21);
		Person p2 = new Person("낌지현", 21);
		Person p3 = new Person("김지현", 21);
		Stone s = new Stone();
		System.out.println("p1과 돌 동일? "+p1.equals(s));
		//예외발생. 
		System.out.println("p1과 돌 동일? "+s.equals(p1));
		System.out.println("p1, p2 동일인물? "+p1.equals(p2));
		System.out.println("p1, p3 동일인물? "+p1.equals(p3));
	}
}
