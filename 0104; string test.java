//커맨드 라인에서 문자열들 입력받아서 문자열들의 길이에 따른 오름차순 정렬할 것.
//java StringTest ab cde fghijk l mnop -> l ab cde mnop fghijk 순으로 정렬
//ab = args[0]

class StringTest{
	public static void main(String [] args){
		String tmp = "hi, world!";
		
		System.out.println("Hello".equalsIgnoreCase("HELLO"));
		//문자열1.equalsIgnoreCase(문자열2): 대소문자 구분없이 문자열 비교
		System.out.println(tmp.replaceAll("hi", "Hello"));//tmp에서 hi를 Hello로 바꿔 출력
		System.out.println(tmp);//기존의 tmp인 "hi, world!" 출력
		//문자열1.replaceAll(문자열a,문자열b): 문자열1안의 문자열a를 문자열b로 바꾼것 생성. 문자열1 자체가 바뀌는것은 아님!
		System.out.println("abc".compareTo("abd"));//-1
		System.out.println("abd".compareTo("abc"));//1
		//S1.compareTo(S2): S1-S2. 문자열 길이, 알파벳순 구분할때 사용 -> 사전식 정렬할때 사용.
		//					-값인 경우 s1의 문자가 s2의 문자보다 작은 경우임
		//사전식정렬; s1,,s2순으로 정렬하고 싶을때 s1.compareTo(s2)값이 음수가 나와야 통과. 양수나오면 바꿔주기.
		
		if(args.length<1){
			System.out.println("[사용법]java StringTest 문자열1 문자열2 ...");
			return;
		}
		for(int i=0; i<args.length; i++) System.out.print(args[i]+" ");
		System.out.println();
		
		//사전식 정렬
		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length; j++){
				//대문자의 경우 문제발생! 대문자가 아스키코드 값이 소문자보다 작기때문에 Xy.compareTo("ab")하면 음수가 나옴. -> IgnoreCase붙여줘야함.
				if(args[i].compareToIgnoreCase(args[j])>0){
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
					}
			}
		}
		
		//오름차순으로 정렬
/*		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length; j++){
				if(args[i].length() > args[j].length()){
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
					}
			}
		}
*/		
		for(int i=0; i<args.length; i++) System.out.print(args[i]+" ");
		System.out.println();
		
	}
}