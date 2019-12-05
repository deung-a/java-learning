//년도, 월 입력받아 며칠까지있는지 출력하기 (switch문 복습)
import java.util.Scanner;

class DayInMonth{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int year, month = 90, days = 31;
		
		System.out.print("몇 년: ");
		year = s.nextInt();
		
		//무한반복문 while(true){}
		while(true){
			System.out.print("몇 월: ");
			month = s.nextInt();	
			//탈출조건
			if(month>0 && month<=12) break;
			System.out.println("[입력오류]달은 1월~12월까지만 유효합니다. 다시 입력 바랍니다.");
		}
		
	/*	do{
			System.out.print("몇 월: ");
			month = s.nextInt();
			if(month<1 || month>12) System.out.println("[입력오류]달은 1월~12월까지만 유효합니다. 다시 입력 바랍니다.");
		}while(month<1 || month>12); //dowhile문: 먼저실행하고 조건판단후 반복
	*/
	/*	System.out.print("몇 월: ");
		month = s.nextInt();
		
		while(month<1 || month>12){
			System.out.print("몇 월: ");
			month = s.nextInt();
		}*/
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				break;
			case 4: case 6: case 9: case 11:
				days = 30; break;
			case 2: //윤년 = 29일, 윤년 = 400의 배수 또는 4의 배수인데 100의배수는 아닌 경우
				if(year%400==0 || (year%4==0 && year%100!=0)) days = 29;
				else days = 28;
				break; //반복문, switch문 종료시에 사용.
			default:
				System.out.println("[입력오류]달은 1월~12월까지만 유효합니다.");
				//return; //함수종료
				System.exit(0);//프로그램 종료
		}
		System.out.format("%d년 %d월: %d일까지 존재\n", year, month, days);
		
	}
}