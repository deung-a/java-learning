import java.util.*;
//�迭(array): ���� Ÿ��(�ڷ���)�� �������� ��Ƴ��� ��
//�迭����; �ڷ���[] �迭�� = new �ڷ���[n];
//�迭���� �ʱ�ȭ ���Ѱ�� null�� ������. �ʱ�ȭ�ϰ���� ��� {}���
//�迭����; �迭��.length

class Car{
	//�ʵ�- �ڵ����� ����, �ڵ����� �귣��
	String brand;
	String color;
	//����Ʈ ������- ���� ���� ����
	Car(){
		this.brand = "����";
		this.color = "��";
	}
}
/*
class ForEachTest{
	public static void main(String [] args){
		//��ü(class)���� �迭
		//Car [] myCars = new Car[10];
		//����ü�� �� �ڸ��� ��������. �ٷ� ����Ϸ��ϸ� �ʱ�ȭ�� �ȵż� ���� �߻�.
		//ù��° �ڵ����� ����		
		Car [] myCars = {new Car(), new Car(), new Car()};
		System.out.println(myCars[0].color);
		
	//	���Ұ� 5���� �Ǽ��� �迭�� �߰�ȣ�� ���� �ʱ�ȭ, �迭�� ���� ���
		double[] arr = {5,4,3,2,1};
	//	for(int i=0; i<arr.length; i++) System.out.print(arr[i]+"\t");
		for(double d: arr){
			System.out.print(d+"\t");
		}
		//for-each��: �迭�� ũ�⸦ �Ű澲�� �ʾƵ� ��. ó������ ���������� ��� ó��. �迭���� ���� �Ұ�.
		//for��: �迭 �Ϻο��Ҹ� ó�� ����. �迭 ���� ���� ����.
		System.out.println();
	}
}*/

class ArrTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("�迭�� ���� ����: ");
		n = s.nextInt();
		double[] arr = new double[n];
		
		input_arr(arr);
		System.out.println("=====�迭 ���� ���=====");
		print_arr(arr);
		rand_arr(arr);
		print_arr(arr);
		System.out.printf("�迭 ���е��� ��: %.2f\n", sum_arr(arr));
		System.out.printf("�迭 ���� �� �ִ�: %.2f\n", max_arr(arr));
		System.out.printf("�ִ��� �ε���: %d\n\n", maxIndex_arr(arr));
		shuf_arr(arr);
		print_arr(arr);
		System.out.println("=====���������� 1ĭ=====");
		rotR_arr(arr);
		print_arr(arr);
		System.out.println("=====��������   1ĭ=====");
		rotL_arr(arr);
		print_arr(arr);
	//	Rot_arr(arr);
	//	print_arr(arr);
	}
	
	//�迭���� �Է¹޾� �ʱ�ȭ�ϴ� �޼ҵ�
	static void input_arr(double[] arr){
		Scanner s = new Scanner(System.in);
		System.out.println("=====�迭 ���� �Է�=====");
		for(int i=0; i<arr.length; i++){
			System.out.print(i+1+"��° ����: ");
			arr[i] = s.nextDouble();
		}
		System.out.println();
	}
	
	//�迭���� ����(0~10)���� �����ϴ� �޼ҵ�
	static void rand_arr(double[] arr){
		System.out.println("=====���� ���� ����=====");
		for(int i=0; i<arr.length; i++){
			arr[i] = Math.random()*10;
		}
	}
	
	//�迭���� ����ϴ� �޼ҵ�
	static void print_arr(double[] arr){
		for(double d: arr) System.out.format("%.2f  ",d);
		System.out.print("\n\n");
	}
	
	//�迭������ �� ��ȯ�ϴ� �޼ҵ�
	static double sum_arr(double[] arr){
		double sum = 0;
		for(double d: arr) sum += d;
		return sum;
	}
	
	//�迭������ �ִ� ��ȯ�ϴ� �޼ҵ�
	static double max_arr(double[] arr){
		double max = 0;
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]) max = arr[i];
		}
		return max;	
	}
	
	//�迭������ �ִ��� �ε��� ��ȯ�ϴ� �޼ҵ�
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
	
	//�迭���� ���� �����ϴ� �޼ҵ�
	static void shuf_arr(double [] arr){
		double tmp;
		System.out.println("=====�迭 ���� ����=====");
		for(int i=0; i<arr.length; i++){
			int r = (int)(Math.random()*arr.length);
			tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
	}
	
	//�迭���� ���������� ��ĭ�� �̵���Ű�� �޼ҵ�
	static void rotR_arr(double [] arr){
		double tmp = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--){
			arr[i] = arr[i-1];			
		}arr[0] = tmp;
	}
	
	//�迭���� �������� ��ĭ�� �̵���Ű�� �޼ҵ�
	static void rotL_arr(double [] arr){
		double tmp = arr[0];
		for(int i=0; i<arr.length-1; i++){
			arr[i] = arr[i+1];			
		}arr[arr.length-1] = tmp;
	}
	
}

//2�����迭; �ڷ���[][] �迭�� = new �ڷ���[][];
//���� ����: �迭��.length, ���� ����: �迭��[0].length

class ArrTest2{
	public static void main(String [] args){
		//�л� 2���� ������ ���� �迭-> 2�� 3��
		//int [][] scores = new int[2][3];
		int [][] scores = {{100,80,100},{90,100,100}};
		//�л� B�� ��������, �л� B�� ��������
		System.out.println("�л� B�� ���� ����: "+scores[1][0]);
		System.out.println("�л� B�� ���� ����: "+scores[1][2]);
		
		//���� ��: �� ����, �л� ��: �� ����
		System.out.println("���� ��: "+scores[0].length);
		System.out.println("�л� ��: "+scores.length);
		
		//B�л��� ���� ���
		//int sum = scores[1][0]+scores[1][1]+scores[1][2];
		int sum = 0;
		for(int i=0; i<scores[0].length; i++) sum += scores[1][i];
		System.out.printf("�л� B�� ���� ���: %.2f\n", ((double)sum/scores[0].length));
		
		//���� ���
		sum = 0;
		for(int i=0; i<scores.length; i++) sum += scores[i][0];
		System.out.printf("���� ���� ���: %.2f\n", ((double)sum/scores.length));
	}
}

























