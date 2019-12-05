//random클래스? java.util.random;
/*
nextDouble() : Math.random()에서 0포함x (0.0<__<1.0)
nextInt() : -2^31 ~ 2^31-1 의 정수형 랜덤넘버 생성
nextInt(int n) : 0부터 n-1 까지의 정수형 랜덤넘버 생성
*/

import java.util.*;//java.util 패키지의 모든 클래스를 import
/*
import java.util.Random; //lang패키지가 아니므로 import해줘야함.
import java.util.Scanner;
*/

class RNTest{
	public static void main(String [] args){
		Random r = new Random();//난수 생성기 만듦. 스캐너클래스와 비슷?
		
/*	//	*Random클래스 사용하여 난수생성*

		//실수형 난수 생성 후 출력
		System.out.println("실수형 난수: " + r.nextDouble());//~Math.random()과 유사
		//정수형 난수 생성 후 출력
		System.out.println("정수형 난수: " + r.nextInt());
		//0~7 정수형 난수 생성 후 출력
		System.out.println("정수형 난수: " + r.nextInt(8));
		*/
	//	*숫자 추측 게임*
		Scanner s = new Scanner(System.in);
		int input, answer = r.nextInt(100);
		
		System.out.print("숫자를 맞춰 보세요(0~100): ");
		input = s.nextInt();
		
		if(input>answer) System.out.printf("정답보다 크네요. 정답 : %d\n", answer);
		else if(input==answer) System.out.printf("%d : 정답입니다!!\n", answer);
		else System.out.printf("정답보다 작네요. 정답 : %d\n", answer);
	}
}