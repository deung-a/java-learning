import java.util.*;
/**예외 종류
	RuntimeException(;unchecked exception)-컴파일은 되는데 예외발생
	그외:PrintWriter()Scanner(f)..(;checked exception)-컴파일러가 예외 걸러줌
*/
class ExceptionTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		//정수 2개 입력받아서 a/b결과출력
		int a, b;
		System.out.print("정수 a: ");
		a = s.nextInt();
		System.out.print("정수 b: ");
		b = s.nextInt();
		
	/*	try{
			System.out.println("a/b = "+a/b);//예외(문제상황) 처리할 문장
		//방법1: 내가 직접 처리 : try{-}catch(Exception e){}
		//	ㄴ일반적으로 제대로 실행되지만 예외가 발생할 수도 있는 코드에 사용
		//방법2: 떠넘기는  방법 : throws Exception(주체:메소드, 함수통째로 예외처리.)
		//	ㄴmain에 쓰는것 비추..!(테스트용).마지막보루.
		}catch(ArithmeticException ae){//catch(어떤 예외를 잡을 것인지 선언){}
			System.out.println("두번째 정수는 0이 아닌 수로 입력해야 합니다.");
		}
		
		System.out.println("나눗셈 프로그램");
		//'0'같은 이상한 값을 받았을때 뒤의 코드가 실행되지않고 비정상적으로 종료됨.
		//ArithmeticException이 발생; 반복문을 통해 처리해줘야함.
		//예외가 여러개일 경우 try{}catch(){}...catch(){}finally{}
		//finally블록: 오류발생에 상관없이 항상 실행되어야 하는 코드에 사용. 생략가능
		*/
		
		//a/b를 반환하는 메소드 작성 후 테스트
		try{
			System.out.println("a/b = "+division(a,b));
			//31라인에서 37번째라인을 실행하면서 예외발생.
		}catch(ArithmeticException ae){
			System.out.println("두번째 정수는 0이 아닌 수로 입력해야 합니다.");
			ae.printStackTrace();//테스트용 프로그램 작성시에 사용.
		}
		System.out.println("나눗셈 프로그램");
	}
	
	static int division(int a, int b) throws ArithmeticException{
		return a/b;
	}
}

/*예외클래스
Object	-Throwable	-Exception	-ClassNotFoundException
								-IOException
								-RuntimeErrorException	-ArithmeticException
														-NullPointerException
														-IndexOutOfBoundsException
														-IllegalArgumentException
														...
								...
					-Error(감당x)-LinkageError
								-VirtualMachineError
								...
예외와 다형성 예시;
Exception	-IOException
			-NumberException-TooBigException
							-TooSmallException
*/

//나이, 이름 입력받아 그대로 출력하는 메소드 만들고 테스트
class InputExceptionTest{
	public static void main(String [] args){
		try{
			input();
		}catch(NegativeAgeException nae){
			System.out.println("[입력오류]나이는 아라비아숫자로 입력바랍니다.");
			nae.printStackTrace();
		}
	}
	static void input() throws NegativeAgeException{
		Scanner s = new Scanner(System.in);
		int age;
		String name;
//나이를 한글로 입력했을 때 발생하는 예외를 잡아서 처리(나이는 아라비아숫자로 입력바랍니다.)하시오
		try{
			System.out.print("이름: ");
			name = s.next();
			System.out.print("나이: ");
			age = s.nextInt();
			if(age<0) throw new NegativeAgeException();
			//throw; JVM에게 예외객체가 생성되었음을 알리는 키워드
			//XD.java:83: error: unreported exception NegativeAgeException; must be caught or declared to be thrown 컴파일이안됨.!! catch하거나 throws해줘야함
			System.out.println(age+"세 "+name);
		}catch(InputMismatchException ime){//util패키지의 클래스임. import해줘야 인식가능
			System.out.println("[입력오류]나이는 아라비아숫자로 입력바랍니다.");
		}
	}
}
//사용자 정의 예외; Exception class를 상속받아줘야함
//음수 나이 예외; 사용자가 나이를 음수로 입력한 경우 발생하는 예외
class NegativeAgeException extends Exception{
	//예외에 대한 정보만 기술
	NegativeAgeException(){
		super("음수나이예외");
	}
}