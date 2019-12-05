/* 반복문 - for문
for(초기화; 반복조건; 증감문){반복할내용}
for(int i=0; i<n; i++){~}
	-> n번 반복!
	i초기화 - 조건을 만족하는가?	- 만족하면 내용 실행 후 증감 - (반복)조건을 만족하는가? -~~
							- 만족 안하면 종료
*/
import java.util.Scanner;

class ForTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		//Hello, world! 열번 출력
/*		for(int i=0; i<10; i++){
			System.out.println("Hello, world!");			
		}
		//System.out.println(i);//컴파일에러(CE): i는 for문 안에서만 유효
*/		
		//* 10개 출력
/*		for(int i=0; i<10; i++) System.out.print("*");
		System.out.println();
		//세로로 출력
		for(int i=0; i<10; i++) System.out.println("*");
		//10*5으로 출력
		for(int j=0; j<5; j++){
			for(int i=0; i<10; i++) System.out.print("*");
			System.out.println();
		}
*/		
		//1~10까지 출력하기
/*		for(int i=0; i<10; i++) System.out.printf("%d ", i);
		System.out.println();
*/		
		//단 입력받아 구구단 출력하기
/*		int dan;
		System.out.print("몇 단: ");
		dan = s.nextInt();
		System.out.printf("=====%d단=====\n", dan);
		for(int i=0; i<9; i++) System.out.printf("%d * %d = %d\n", dan, i+1, (i+1)*dan);
		System.out.println();
*/				
		//1~10까지의 합 구하기
/*		int sum = 0;
		for(int i=0; i<10; i++){
			sum += i+1;
			System.out.print(i+1);
			if(i<9) System.out.print("+");
		}
		System.out.println(" = "+sum);
*/		
		//n! 구하기(overflow 발생시점 파악)
/*		long n, fact = 1, ovflcheck, preFact = fact;
		System.out.print("정수: ");
		n = s.nextInt();
		for(int i=1; i<=n; i++){
			fact *= i;
			if(fact/i != preFact){
				System.out.printf("%d!을 구하는 과정에서 overflow 발생.", i);
				return;
			}
			preFact = fact;
		}
		System.out.printf("%d! = %d\n", n, fact);
*/		
		//사용자로부터 a, b를 입력받아 a부터 b의 약수를 출력(작은수부터 큰수)
/*		int a, b, tmp;
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		if(a>b){tmp = a; a = b; b = tmp;}
		
		for(int j=a; j<=b; j++){
			System.out.printf(j+"의 약수는 ");
			for(int i=1; i<j; i++){
				if(j%i==0) System.out.printf(i+" ");
			}
		System.out.println();
		}
*/		
		//*로 직각삼각형 출력(좌측정렬)
/*		int row;
		System.out.print("직각삼각형을 출력합니다.\n단: ");
		row = s.nextInt();
		
		for(int j=1; j<=row; j++){
			for(int i=1; i<=j; i++) System.out.print("*");
			System.out.println();
		}
*/	
		
		//직각삼각형 출력(우측정렬)
/*		System.out.print("직각삼각형을 출력합니다.\n단: ");
		row = s.nextInt();
		
		for(int j=1; j<=row; j++){
			for(int i=0; i<row-j; i++) System.out.print(" ");
			for(int i=1; i<=j; i++) System.out.print("*");
			System.out.println();
		}
*/		
		//역직각삼각형 출력(우측정렬)
/*		int row;
		System.out.print("직각삼각형을 출력합니다.\n단: ");
		row = s.nextInt();
		
		for(int j=0; j<row; j++){
			for(int i=0; i<j; i++) System.out.print(" ");
			for(int i=0; i<row-j; i++) System.out.print("*");
			System.out.println();
		}*/
			
		//피라미드 출력
/*		int row;
		System.out.print("피라미드를 출력합니다.\n단: ");
		row = s.nextInt();
		
		for(int i=0; i<row; i++){
			//i층 출력
			//공백 출력: row-1-i번
			for(int j=0; j<row-1-i; j++) System.out.print(" ");
			//별 출력: 2*i+1번
			for(int j=0; j<2*i+1; j++) System.out.print("*");
			System.out.println();
		}
*/		
		//역피라미드 출력
		int row;
		System.out.print("피라미드를 출력합니다.\n단: ");
		row = s.nextInt();
		
		for(int i=0; i<row; i++){
			//i층 출력
			//공백 출력: i번
			for(int j=0; j<i; j++) System.out.print(" ");
			//별 출력: 2*row-1-2*i번
			for(int j=0; j<2*row-1-2*i; j++) System.out.print("*");
			System.out.println();
		}
		
		
		//구구단 n열씩 출력하기(입력받아서) 
		
		
		
		
		
		
	
	}
}