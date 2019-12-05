//import java.io.File;
import java.io.*;
import java.util.*;

class FileTest{
	public static void main(String [] args){
		/*
		System.out.println("������ �����ϴ� ����? "+javaFolder.exists());
		System.out.println("���� ũ��? "+javaFolder.length());
		//exists�� length�� ����Ұ�!!
		System.out.println("����? "+javaFolder.isDirectory());
		System.out.println("����? "+javaFolder.isFile());
		System.out.println("������? "+javaFolder.isAbsolute());
		System.out.println("eatTest�� ������: "+eatTest.getAbsolutePath());
		*/
//0117		
		File f1 = new File("C:\\Users\\Win7\\Desktop\\��\\�Ҳ���\\Test5.java");
		//������; ���� ������ ó������ ������
		// '\'�齽���� ����Ϸ��� �ι��������. '\\'
		//������������ ����� �� ����. �齽����'\'�� ������ �����̱⶧��. �������� '/'
		File f2 = new File("�Ҳ���"+File.separator+"Test5.java");
		//�����; ���� �����κ����� ��θ� ����
		//�����ó� �齽���� ��� File.separator ����ϸ� �ü���� ������� ��� ����
		System.out.println("f2�� ����? "+ f2.exists());
		System.out.println("f2�� �̸�? "+ f2.getName());
		System.out.println("f2�� �̸�? "+ f2);
		
	}
}

//����ڷκ��� �̸�(�������)�� ���� �Է¹޾� �״�� ����ϴ� ���α׷�

//java WriteTest ��������ϸ�
//�ش� ���Ͽ� ���
//����ڰ� ����� ���ϸ��� �Է����� �ʴ´ٸ� ���� ���� ����ϱ�
//���� �ش������� �̹� �����Ѵٸ� "**������ �̹� �����մϴ�." ����������� ����
class WriteTest{
	public static void main(String [] args)
	throws Exception{
		if(args.length<1){
			System.out.println("Usage: java WriteTest ��������ϸ�");
			return;
		}
		//1.���ϻ���
		File f = new File(args[0]);
		if(f.exists()){
			System.out.printf("\"%s\" ������ �̹� �����մϴ�. ���α׷��� �����մϴ�\n", f.getName());
			return;
		}
		//2.���Ͽ� ��Ʈ������
		PrintWriter pw = new PrintWriter(f);
		
		Scanner s = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("�̸�: ");
		name = s.next();
		System.out.print("����: ");
		age = s.nextInt();
		
		//����Ϳ� ���
		//System.out.println(age+"�� "+name);
		
		//3.���Ͽ� ���
		pw.println(age+"�� "+name);
		//���Ͽ� ���� �ۼ� �Ϸ�
		
		//4.���� �ݱ�
		pw.close();
		
		System.out.println("���� �ۼ� �Ϸ�. "+f.getName()+"������ Ȯ�����ּ���.");
		
	}
}

//���� �Է�: ���Ϸκ��� �ڷ� �б�
//abc.txt ���� ���� �о�ͼ� �ֿܼ� ����ϱ�
class ReadTest{
	public static void main(String [] args){
		//1. ���ϰ�ü ����
		File f = new File("abc.txt");
		
		try{
		//2. �Է½�Ʈ�� ����
			Scanner s = new Scanner(f);
			
			while(s.hasNext()){//���� ������ ���������� �о���ڴ�.
			//�о�� ������ ���Ҵٸ� ��� �о�޶�.
				System.out.println(s.nextLine());
			}
			
			s.close();
		}catch(/*Exception e*/FileNotFoundException fnfe){
			//System.out.println("���� �߻�");
			System.out.println("FileNotFoundException �߻�");
		}
		
	}
}
//throws Exception: ���ܹ߻��� ��� �ٸ��Ϳ� ���ѱ�
//try-catch(Exception e): �õ��ϰ� ���� �ذ�

//�л�����.txt ���Ϸκ��� ������ �Է¹޾� �Է¹��� ������ �̸�: ***, ����: *��, ����: **
class ReadTest2{
	public static void main(String [] args) throws Exception{
		File f = new File("�л�����.txt");
		Scanner s = new Scanner(f);
		String name;
		int age;
		double score;
		
		while(s.hasNext()){
			name = s.next();
			age = s.nextInt();
			score = s.nextDouble();
			System.out.printf("�̸�: %s, ����: %d��, ����: %.2f\n", name, age, score);
		}
		s.close();
	}
}

//���Ϻ������α׷�; java CopyFile �������ϸ� ���纻���ϸ�
//main()�� ���ڰ� 2�� �̸��ΰ�� ���α׷� ����.
//���������� �������� �ʴ´ٸ� ���α׷� ����, ���纻������ �����ϸ� ���α׷� ����
//���� �Ϸ��Ŀ��� �ֿܼ� "����Ϸ�, **���纻 ������ Ȯ�����ּ���" ���� ���

class CopyFile{
	public static void main(String [] args) throws Exception{
		if(args.length<2){
			System.out.println("[Usage]java CopyFile �������ϸ� ���������ϸ�");
			return;
		}
		File original = new File(args[0]);
		File copy = new File(args[1]);
		if(!original.exists()){
			System.out.printf("[�Է¿���]\"%s\"������ �������� �ʽ��ϴ�.\n", original.getName());
			return;
		}
		else if(copy.exists()){
			System.out.printf("[�Է¿���]\"%s\"������ �̹� �����մϴ�.\n", copy.getName());
			return;
		}
		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(copy);
		
		while(s.hasNext()){
			pw.println(s.nextLine());
		}
		s.close();
		pw.close();
		
		System.out.printf("����Ϸ�, \"%s\"���纻 ������ Ȯ�����ּ���.\n", copy);
		
	}
}

/*String class; java.lang.String ����

- equals()
- equalsIgnoreCase()
- compareTo(); ������ �����Ҷ�
- compareToIgnoreCase()
- charAt(i)
- replaceAll(���ܾ�, �Ŵܾ�)
- substring(n); n+1��° ���ں��� ������ ���ڱ��� ����(�ε��� n~������)
- substring(a, b); a+1��° ���ں��� b���� ����(�ε��� a���� b����)
	��) String tmp = "hi, world!"; ���� world�� �����Ұ�� substring(4,9)
*/

//�ܾü ���α׷�; java ReplaceFile �������� ��ü���� ���ܾ� �Ŵܾ�
class ReplaceFile{
	public static void main(String [] args) throws Exception{
		if(args.length<4){
			System.out.println("[Usage]java ReplaceFile �������� ��ü���� ���ܾ� �Ŵܾ�");
			return;
		}
		File original = new File(args[0]);
		File replace = new File(args[1]);

		if(!original.exists()){
			System.out.printf("[�Է¿���]\"%s\"������ �������� �ʽ��ϴ�.\n", original.getName());
			return;
		}
		else if(replace.exists()){
			System.out.printf("[�Է¿���]\"%s\"������ �̹� �����մϴ�.\n", replace.getName());
			return;
		}
		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(replace);
		
		while(s.hasNext()){
			pw.println(s.nextLine().replaceAll(args[2], args[3]));
		}
		s.close();
		pw.close();
		
		System.out.printf("�ܾü�Ϸ�, \"%s\"��ü�� ������ Ȯ�����ּ���.\n", replace);
		
	}
}