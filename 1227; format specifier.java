//서식지정자: %~. %d, %o, %x(정수), %f(실수), %c(문자), %s(문장, 문자열)
//사용자로부터 정수 하나 입력받아 그대로 출력
import java.util.Scanner;

class FormatSpecifier{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double d;
		
		System.out.printf("%s\n", "Hello.");
		
		System.out.print("실수: ");
		d = s.nextDouble();
		
		System.out.printf("입력하신 실수는 %+5.3f입니다.\n", d);//소숫점 아래 셋째자리까지 출력, %n~; n째칸부터 시작.
		
		int input;
		
		System.out.print("정수: ");
		input = s.nextInt();
		
		System.out.printf("입력하신 정수의 문자형태는 %c입니다.\n", input);
		System.out.println("입력하신 정수는 " + input + "입니다.");
		System.out.printf("입력하신 정수는 %d입니다.\n", input);
		//%d: decimal(10진수)
		/*
		//입력받은 수를 8진수로 출력하기: %o(octal)
		System.out.printf("입력하신 정수는 %o입니다.\n", input);
		//입력받은 수를 16진수로 출력하기: %x(hexadecimal), %h
		System.out.printf("입력하신 정수는 %x입니다.\n", input);
		
		//n진수인지 표시하기; %#~. (8진수: 0__, 16진수: 0x__. 10진수는 표시x)
		System.out.printf("입력하신 정수는 %d, %1$#o, %1$#x입니다.\n", input);	
		//같은 변수를 불러올때 %n$__: n번째 인자를 불러오겠다는 뜻 
		*/
		
		//허수부가 0일때는 허수부 출력하지 않도록 변경	
		int real, imag;
		
		System.out.print("실수부: ");
		real = s.nextInt();
		System.out.print("허수부: ");
		imag = s.nextInt();
		
		String result = imag==0?String.format("%d", real):String.format("%d %+di", real, imag);
		
		System.out.printf("입력하신 복소수는 %s 입니다.\n", result);
		//%+~ 부호출력(10진수형태)
		
		}
}
/*
//자료는 더 큰 자료형의 변수에만 저장할 수 있다.
float f = 2.3; 2.3(double형), 자료손실 발생하기 때문에 컴파일 불가

float f = 2.3F;
float f = (float)2.3;
//double 에 float 저장은 가능
double d = 2.3;
double d = 2.3f; 컴파일 가능
//int에 double 저장은 불가
int i = 2.3; //컴파일 불가.
*/