import java.util.Scanner;
//생성자: 객체가 생성될 때 필드를 초기화하는 특별한 메소드

/* 	자동차 클래스 필드 추가; 브랜드, 연식, 색상
	생성자; 브랜드,연식을 받아 초기화하는 생성자
*//*
메소드 시그니처(signature) = 메소드이름+매개변수
시그니처가 다른 함수는 정의 가능: 즉, 이름이 같더라도 매개변수가 다르다면 중복정의 가능, 반환타입이 다른것 불가능.
메소드 중복정의: method overloading
예)	void add(int a, int b){}, void add(int a, int b, int c){} ==> 가능
	int add(int a, int b){}, void add(int a, int b) ==> 불가능!!
*/

//자동차 테스트
class Car{
	private int mileage;//주행거리
	private String brand;
	private int year;
	private String color;
	
	//생성자; main함수에서 객체 생성할때 초기화하게 해줌.
	Car(String brand, int year){
		this.brand = brand;
		this.year = year;	
	}
	//브랜드, 연식, 색상을 받아 초기화하는 생성자
	Car(String brand, int year, String color){
/*		this.brand = brand;
		this.year = year;*/
		this(brand, year);//이 클래스의 생성자 부를때 this라고 표시가능
		this.color = color;
	}
	//디폴트 생성자: 매개변수가 하나도 없는 기본생성자
	Car(){
		//2019년식 은색 벤츠 생성
		this("벤츠", 2019, "silver");
	}
	
	//!!!toString(): 객체의 정보를 문자열로 반환하는 메소드.!!!중요
	//"이 자동차는 **년식 **색 **자동차입니다." 문장을 반환하는 메소드
	public String toString(){
		return String.format("이 자동차는 %s의 %d년식 %s색 자동차입니다.", brand, year, color);
	//	return "이 자동차는 "+brand+"의 "+year+"년식 "+color+"색 자동차입니다.";
	}
	
	//add 메소드: 두 정수를 매개변수로 받아 두 정수의 합을 반환하는 함수
	int add(int a, int b){
		return a+b;		
	}
	//add 메소드: 세 정수를 매개변수로 받아 세 정수의 합을 반환하는 함수
	int add(int a, int b, int c){
	//	return a+b+c;
		return this.add(this.add(a,b),c);//여기서는 this 굳이 안붙여도 되긴 함.
	}
	
	//직진하는 메소드
	public void goStraight(int distance){
		System.out.println(distance+"m 직진했습니다.");
		mileage += distance;
	}	
	public void turnLeft(){
		System.out.print("좌회전 후 ");
	}
	public void turnRight(){
		System.out.print("우회전 후 ");
	}
	public int getMileage(){
		return mileage;
	}
}

class Driver{
	public static void main(String [] args){
		Car myCar = new Car("현대 자동차", 2019);
		Car yourCar = new Car("마세라티", 2018, "black");
		Car c = new Car();
		
		System.out.println(yourCar);//객체이름만 적어도 toString메소드를 사용한 것과 같은결과!!!!
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
		System.out.println("총 주행거리는 "+myCar.getMileage()+"m 입니다.");
	}	
}

//HW6 Elevator, ElevatorTest
class Elevator{
	private int floor;
	private boolean door = true;
	
	void open(){
		door = true;
		System.out.println("문이 열립니다.");
	}
	void close(){
		door = false;
		System.out.println("문이 닫힙니다.");
	}
	void report(){
		if(floor==0) System.out.println("로비 입니다.");
		else if(floor<0) System.out.println("B"+Math.abs(floor)+"층 입니다.");
		else System.out.println(floor+"층 입니다.");
	}
	void move(int floor){
		if(floor<-2 || floor>10){
			System.out.println("유효한 층수로 입력해주세요(-2 ~ 10층)");
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
				System.out.println("예외발생");
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
				System.out.println("예외발생");
			}
			open();
		}
	}
}

class ElevatorTest{
	public static void main(String [] args){
		Elevator e = new Elevator();
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 층: ");
		e.move(s.nextInt());
		System.out.print("몇 층: ");
		e.move(s.nextInt());
		System.out.print("몇 층: ");
		e.move(s.nextInt());
		
	}
}

class ThreadTest{
	public static void main(String [] args)/*throws Exception==>예외 발생하면 넘기겠다.*/{
		//혹은 try{~Thread.sleep(~)}catch(Exception e){~}
		try{
			for(int i=1; i<=10; i++){
				System.out.print(i+" ");
				Thread.sleep(1000);//1초씩 쉰다.
			}
		}catch(Exception e){
			System.out.println("예외 발생");
		}
	}
}

/*
중간점검문제
1. 객체들을 만드는 설계도에 해당되는 것이 _____________이다.
- 클래스
2. 같은 종류의 객체가 여러 개 생성될 때 각 객체의 필드와 메소드는 공유되는가? 아니면 각 객체마다 별도로 만들어지는가?
- 필드는 개별적, 메소드는 공유됨.
3. 클래스 선언 시에 클래스 안에 포함되는 것은 _____과 ______이다.
- 필드(속성), 메소드(함수)
4. 객체의 멤버에 접근하는데 사용되는 연산자는 ________이다.
- 도트(.)
5. 각 객체마다 별도로 가지고 있는 것은 클래스의 _________이다.
- 필드
6. 상품의 재고를 나타내는 클래스를 작성하여 보자. 클래스 안에 상품 번호, 재고수량이 필드로 저장되고 재고를 증가, 감소하는 메소드를 작성하여 보라.

메소드: 입력을 받아서 처리를 하고 결과 반환하는 것
- 반환타입 메소드명(매개변수), 반환값이 없을 경우 반환타입 void
- 입력값(인자)->매개변수에 저장, 결과값(반환값);return 값

중간점검문제2
1. 기초 변수와 참조 변수의 차이점은 무엇인가?
- 기초변수;실제 값이 저장되는것, 참조변수;참조값(주소값)이 저장됨.
2. 하나의 참조 변수가 다른 참조 변수로 대입되면 어떤 일이 발생하는가?
- 원래있던 변수가 없어짐. myCar=yourCar 하면 myCar=null과 같음.
3. 객체를 소멸시키려면 어떻게 하면 되는가?
-
*/