import java.util.Scanner;
//성적을 입력받아 50점 이상이라면 합격, 장학금50만원 출력하기
/*
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int score;
		
		System.out.print("점수: ");
		score = s.nextInt();
		
		if(score>=70){
			System.out.println("합격");
			System.out.println("장학금 100만원");
		}else if(score>=50){
			System.out.println("합격");
			System.out.println("장학금 100만원");
		}else System.out.println("불합격");
	}
}*/

//점검문제
//2. 3 -> C, 0 -> A, -1 -> C
//3.컵의 사이즈를 받아서 100ml미만은 small, 100ml이상 200ml미만은 medium, 200ml 이상은 large라고 출력하는 연속적인 if-else 문을 작성하시오
/*
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int size;
		System.out.print("컵의 사이즈(ml): ");
		size = s.nextInt();
		
		if(size>=200) System.out.println("large");
		else if(size>=100) System.out.println("medium");
		//if 에서 size<200인 것만 걸러졌기때문에 중복해서 작성할필요x
		else System.out.println("small");
	}
}*/
//자동차 면허 필기 합격 여부(1급의 경우 : 70점 이상, 2급의 경우 : 60점 이상)
/*
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String type;//참조변수
		int	score;//기초변수
		
		System.out.print("면허시험 종류선택('1종'또는 '2종'): ");
		type = s.nextLine();
		System.out.print("필기 면허시험 점수 입력: ");
		score = s.nextInt();
		
	//	!!!문자열내용 비교할때는 __.equals("")!!!
		if(type.equals("1종")){
			if(score>=70) System.out.println("합격");
			else System.out.println("불합격");
		}else if(type.equals("2종")){
			if(score>=60) System.out.println("합격");
			else System.out.println("불합격");
		}else System.out.println("[입력오류]타입은 1종,2종으로만 입력해주세요.");
	}
}*/

// 사용자로부터 임의의 정수(int input)를 입력 받아 그 값에 따라 int형 변수 b를 아래와 같이 초기화 하시오.
//양수이면 b에 1을, 음수이면 b에 -1을, 0이면 b에 0을 대입.
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
	//	!!!마지막에 else를 사용하지 않는다면 컴파일이 되지 않는다!!!
	//	else의 짝은 가장 인접한 if이다. 다르게 하고싶으면 {}사용!
		System.out.printf("결과: %d\n", b);
	}
}*/

//오늘 요일 입력받기: 1(월)2(화),,0(일). 몇일 후? 입력받기
class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int day, after;
		
		System.out.print("무슨 요일? ");
		day = s.nextInt();
		System.out.print("몇일 후? ");
		after = s.nextInt();
		
		System.out.printf("%d일 후는 %d요일 입니다.\n", after, (day+after)%7);
	}
}