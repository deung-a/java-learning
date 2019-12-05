import java.util.*;
//배열(array): 같은 타입(자료형)의 변수들을 모아놓은 것
//배열선언; 자료형[] 배열명 = new 자료형[n];
//배열원소 초기화 안한경우 null값 설정됨. 초기화하고싶은 경우 {}사용
//배열길이; 배열명.length

class Car{
	//필드- 자동차의 색상, 자동차의 브랜드
	String brand;
	String color;
	//디폴트 생성자- 은색 벤츠 생성
	Car(){
		this.brand = "벤츠";
		this.color = "은";
	}
}
/*
class ForEachTest{
	public static void main(String [] args){
		//객체(class)들의 배열
		//Car [] myCars = new Car[10];
		//ㄴ객체가 들어갈 자리만 만들어놓음. 바로 출력하려하면 초기화가 안돼서 예외 발생.
		//첫번째 자동차의 색상		
		Car [] myCars = {new Car(), new Car(), new Car()};
		System.out.println(myCars[0].color);
		
	//	원소가 5개인 실수형 배열을 중괄호를 통해 초기화, 배열의 성분 출력
		double[] arr = {5,4,3,2,1};
	//	for(int i=0; i<arr.length; i++) System.out.print(arr[i]+"\t");
		for(double d: arr){
			System.out.print(d+"\t");
		}
		//for-each문: 배열의 크기를 신경쓰지 않아도 됨. 처음부터 마지막까지 모두 처리. 배열원소 변경 불가.
		//for문: 배열 일부원소만 처리 가능. 배열 원소 변경 가능.
		System.out.println();
	}
}*/

class ArrTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("배열의 원소 개수: ");
		n = s.nextInt();
		double[] arr = new double[n];
		
		input_arr(arr);
		System.out.println("=====배열 성분 출력=====");
		print_arr(arr);
		rand_arr(arr);
		print_arr(arr);
		System.out.printf("배열 성분들의 합: %.2f\n", sum_arr(arr));
		System.out.printf("배열 성분 중 최댓값: %.2f\n", max_arr(arr));
		System.out.printf("최댓값의 인덱스: %d\n\n", maxIndex_arr(arr));
		shuf_arr(arr);
		print_arr(arr);
		System.out.println("=====오른쪽으로 1칸=====");
		rotR_arr(arr);
		print_arr(arr);
		System.out.println("=====왼쪽으로   1칸=====");
		rotL_arr(arr);
		print_arr(arr);
	//	Rot_arr(arr);
	//	print_arr(arr);
	}
	
	//배열성분 입력받아 초기화하는 메소드
	static void input_arr(double[] arr){
		Scanner s = new Scanner(System.in);
		System.out.println("=====배열 성분 입력=====");
		for(int i=0; i<arr.length; i++){
			System.out.print(i+1+"번째 성분: ");
			arr[i] = s.nextDouble();
		}
		System.out.println();
	}
	
	//배열성분 랜덤(0~10)으로 설정하는 메소드
	static void rand_arr(double[] arr){
		System.out.println("=====성분 랜덤 설정=====");
		for(int i=0; i<arr.length; i++){
			arr[i] = Math.random()*10;
		}
	}
	
	//배열성분 출력하는 메소드
	static void print_arr(double[] arr){
		for(double d: arr) System.out.format("%.2f  ",d);
		System.out.print("\n\n");
	}
	
	//배열성분의 합 반환하는 메소드
	static double sum_arr(double[] arr){
		double sum = 0;
		for(double d: arr) sum += d;
		return sum;
	}
	
	//배열성분중 최댓값 반환하는 메소드
	static double max_arr(double[] arr){
		double max = 0;
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]) max = arr[i];
		}
		return max;	
	}
	
	//배열성분중 최댓값의 인덱스 반환하는 메소드
	static int maxIndex_arr(double[] arr){
		double max = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	//배열성분 랜덤 셔플하는 메소드
	static void shuf_arr(double [] arr){
		double tmp;
		System.out.println("=====배열 성분 셔플=====");
		for(int i=0; i<arr.length; i++){
			int r = (int)(Math.random()*arr.length);
			tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
	}
	
	//배열성분 오른쪽으로 한칸씩 이동시키는 메소드
	static void rotR_arr(double [] arr){
		double tmp = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--){
			arr[i] = arr[i-1];			
		}arr[0] = tmp;
	}
	
	//배열성분 왼쪽으로 한칸씩 이동시키는 메소드
	static void rotL_arr(double [] arr){
		double tmp = arr[0];
		for(int i=0; i<arr.length-1; i++){
			arr[i] = arr[i+1];			
		}arr[arr.length-1] = tmp;
	}
	
}

//2차원배열; 자료형[][] 배열명 = new 자료형[][];
//행의 개수: 배열명.length, 열의 개수: 배열명[0].length

class ArrTest2{
	public static void main(String [] args){
		//학생 2명의 국영수 점수 배열-> 2행 3열
		//int [][] scores = new int[2][3];
		int [][] scores = {{100,80,100},{90,100,100}};
		//학생 B의 국어점수, 학생 B의 수학점수
		System.out.println("학생 B의 국어 점수: "+scores[1][0]);
		System.out.println("학생 B의 수학 점수: "+scores[1][2]);
		
		//과목 수: 열 개수, 학생 수: 행 개수
		System.out.println("과목 수: "+scores[0].length);
		System.out.println("학생 수: "+scores.length);
		
		//B학생의 점수 평균
		//int sum = scores[1][0]+scores[1][1]+scores[1][2];
		int sum = 0;
		for(int i=0; i<scores[0].length; i++) sum += scores[1][i];
		System.out.printf("학생 B의 점수 평균: %.2f\n", ((double)sum/scores[0].length));
		
		//국어 평균
		sum = 0;
		for(int i=0; i<scores.length; i++) sum += scores[i][0];
		System.out.printf("국어 점수 평균: %.2f\n", ((double)sum/scores.length));
	}
}

























