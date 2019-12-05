//Hello, world 모니터에 출력
import java.util.Scanner;

class Hello{
	public static void main(String [] args){
		/*
		System.out.printf("Hello, world.\n");//System.out = 모니터(표준출력)
		System.out.println("Hello, world.");//println():자동개행
		System.out.print("Hello, world.");//print() = println()에서 개행 뺀거
		System.out.format("Hello, wolrd.");//format() = printf()
		*/
		
		//사용자에게 나이, 시력 입력받아 그대로 출력
		Scanner myScanner = new Scanner(System.in);//System.in = 키보드(표준입력)
		//자료형 이름 = new Scanner(System.in); 스캐너만들기.
		
		System.out.print("나이: ");
		int age = myScanner.nextInt();
		
		System.out.print("시력: ");
		double eye = myScanner.nextDouble();
		
		System.out.printf("입력한 나이는 %d세, 시력은 %.1f 입니다.\n", age, eye);
				
		//나이(정수), 이름(문자열), 시력(실수) 출력
		//f가 포함된 함수(printf, format,,)에서는 %(서식지정자;format specifier)를 사용할 수 있음.
		System.out.printf("나이: %d세, 이름: %s, 시력: %.2f\n", 5, "김지현", 1.123456);
		System.out.format("나이: %d세, 이름: %s, 시력: %.2f\n", 5, "김지현", 1.123456);
		//print()는 안됨..
		
	}
	
}