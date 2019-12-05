//import java.io.File;
import java.io.*;
import java.util.*;

class FileTest{
	public static void main(String [] args){
		/*
		System.out.println("실제로 존재하는 파일? "+javaFolder.exists());
		System.out.println("파일 크기? "+javaFolder.length());
		//exists와 length는 기억할것!!
		System.out.println("폴더? "+javaFolder.isDirectory());
		System.out.println("파일? "+javaFolder.isFile());
		System.out.println("절대경로? "+javaFolder.isAbsolute());
		System.out.println("eatTest의 절대경로: "+eatTest.getAbsolutePath());
		*/
//0117		
		File f1 = new File("C:\\Users\\Win7\\Desktop\\닭\\꾀꼬리\\Test5.java");
		//절대경로; 파일 도메인 처음부터 다적음
		// '\'백슬래시 출력하려면 두번해줘야함. '\\'
		//리눅스에서는 사용할 수 없음. 백슬래시'\'는 윈도우 전용이기때문. 리눅스는 '/'
		File f2 = new File("꾀꼬리"+File.separator+"Test5.java");
		//상대경로; 현재 폴더로부터의 경로만 적음
		//슬래시나 백슬래시 대신 File.separator 사용하면 운영체제에 상관없이 사용 가능
		System.out.println("f2의 존재? "+ f2.exists());
		System.out.println("f2의 이름? "+ f2.getName());
		System.out.println("f2의 이름? "+ f2);
		
	}
}

//사용자로부터 이름(공백없음)과 나이 입력받아 그대로 출력하는 프로그램

//java WriteTest 출력할파일명
//해당 파일에 출력
//사용자가 출력할 파일명을 입력하지 않는다면 도움말 띄우고 출력하기
//만약 해당파일이 이미 존재한다면 "**파일이 이미 존재합니다." 오류문장띄우고 종료
class WriteTest{
	public static void main(String [] args)
	throws Exception{
		if(args.length<1){
			System.out.println("Usage: java WriteTest 출력할파일명");
			return;
		}
		//1.파일생성
		File f = new File(args[0]);
		if(f.exists()){
			System.out.printf("\"%s\" 파일이 이미 존재합니다. 프로그램을 종료합니다\n", f.getName());
			return;
		}
		//2.파일에 스트림생성
		PrintWriter pw = new PrintWriter(f);
		
		Scanner s = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("이름: ");
		name = s.next();
		System.out.print("나이: ");
		age = s.nextInt();
		
		//모니터에 출력
		//System.out.println(age+"세 "+name);
		
		//3.파일에 출력
		pw.println(age+"세 "+name);
		//파일에 내용 작성 완료
		
		//4.파일 닫기
		pw.close();
		
		System.out.println("파일 작성 완료. "+f.getName()+"파일을 확인해주세요.");
		
	}
}

//파일 입력: 파일로부터 자료 읽기
//abc.txt 파일 내용 읽어와서 콘솔에 출력하기
class ReadTest{
	public static void main(String [] args){
		//1. 파일객체 생성
		File f = new File("abc.txt");
		
		try{
		//2. 입력스트림 생성
			Scanner s = new Scanner(f);
			
			while(s.hasNext()){//파일 내용이 끝날때까지 읽어오겠다.
			//읽어올 내용이 남았다면 계속 읽어달라.
				System.out.println(s.nextLine());
			}
			
			s.close();
		}catch(/*Exception e*/FileNotFoundException fnfe){
			//System.out.println("예외 발생");
			System.out.println("FileNotFoundException 발생");
		}
		
	}
}
//throws Exception: 예외발생할 경우 다른것에 떠넘김
//try-catch(Exception e): 시도하고 직접 해결

//학생정보.txt 파일로부터 정보를 입력받아 입력받은 내용을 이름: ***, 나이: *세, 학점: **
class ReadTest2{
	public static void main(String [] args) throws Exception{
		File f = new File("학생정보.txt");
		Scanner s = new Scanner(f);
		String name;
		int age;
		double score;
		
		while(s.hasNext()){
			name = s.next();
			age = s.nextInt();
			score = s.nextDouble();
			System.out.printf("이름: %s, 나이: %d세, 학점: %.2f\n", name, age, score);
		}
		s.close();
	}
}

//파일복사프로그램; java CopyFile 원본파일명 복사본파일명
//main()의 인자가 2개 미만인경우 프로그램 종료.
//원본파일이 존재하지 않는다면 프로그램 종료, 복사본파일이 존재하면 프로그램 종료
//복사 완료후에는 콘솔에 "복사완료, **복사본 파일을 확인해주세요" 문장 출력

class CopyFile{
	public static void main(String [] args) throws Exception{
		if(args.length<2){
			System.out.println("[Usage]java CopyFile 원본파일명 복사할파일명");
			return;
		}
		File original = new File(args[0]);
		File copy = new File(args[1]);
		if(!original.exists()){
			System.out.printf("[입력오류]\"%s\"파일이 존재하지 않습니다.\n", original.getName());
			return;
		}
		else if(copy.exists()){
			System.out.printf("[입력오류]\"%s\"파일이 이미 존재합니다.\n", copy.getName());
			return;
		}
		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(copy);
		
		while(s.hasNext()){
			pw.println(s.nextLine());
		}
		s.close();
		pw.close();
		
		System.out.printf("복사완료, \"%s\"복사본 파일을 확인해주세요.\n", copy);
		
	}
}

/*String class; java.lang.String 참고

- equals()
- equalsIgnoreCase()
- compareTo(); 사전식 정렬할때
- compareToIgnoreCase()
- charAt(i)
- replaceAll(구단어, 신단어)
- substring(n); n+1번째 문자부터 마지막 문자까지 추출(인덱스 n~마지막)
- substring(a, b); a+1번째 문자부터 b까지 추출(인덱스 a에서 b까지)
	예) String tmp = "hi, world!"; 에서 world만 추출할경우 substring(4,9)
*/

//단어교체 프로그램; java ReplaceFile 원본파일 대체파일 구단어 신단어
class ReplaceFile{
	public static void main(String [] args) throws Exception{
		if(args.length<4){
			System.out.println("[Usage]java ReplaceFile 원본파일 대체파일 구단어 신단어");
			return;
		}
		File original = new File(args[0]);
		File replace = new File(args[1]);

		if(!original.exists()){
			System.out.printf("[입력오류]\"%s\"파일이 존재하지 않습니다.\n", original.getName());
			return;
		}
		else if(replace.exists()){
			System.out.printf("[입력오류]\"%s\"파일이 이미 존재합니다.\n", replace.getName());
			return;
		}
		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(replace);
		
		while(s.hasNext()){
			pw.println(s.nextLine().replaceAll(args[2], args[3]));
		}
		s.close();
		pw.close();
		
		System.out.printf("단어교체완료, \"%s\"교체본 파일을 확인해주세요.\n", replace);
		
	}
}