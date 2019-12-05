//Ŀ�ǵ� ���ο��� ���ڿ��� �Է¹޾Ƽ� ���ڿ����� ���̿� ���� �������� ������ ��.
//java StringTest ab cde fghijk l mnop -> l ab cde mnop fghijk ������ ����
//ab = args[0]

class StringTest{
	public static void main(String [] args){
		String tmp = "hi, world!";
		
		System.out.println("Hello".equalsIgnoreCase("HELLO"));
		//���ڿ�1.equalsIgnoreCase(���ڿ�2): ��ҹ��� ���о��� ���ڿ� ��
		System.out.println(tmp.replaceAll("hi", "Hello"));//tmp���� hi�� Hello�� �ٲ� ���
		System.out.println(tmp);//������ tmp�� "hi, world!" ���
		//���ڿ�1.replaceAll(���ڿ�a,���ڿ�b): ���ڿ�1���� ���ڿ�a�� ���ڿ�b�� �ٲ۰� ����. ���ڿ�1 ��ü�� �ٲ�°��� �ƴ�!
		System.out.println("abc".compareTo("abd"));//-1
		System.out.println("abd".compareTo("abc"));//1
		//S1.compareTo(S2): S1-S2. ���ڿ� ����, ���ĺ��� �����Ҷ� ��� -> ������ �����Ҷ� ���.
		//					-���� ��� s1�� ���ڰ� s2�� ���ں��� ���� �����
		//����������; s1,,s2������ �����ϰ� ������ s1.compareTo(s2)���� ������ ���;� ���. ��������� �ٲ��ֱ�.
		
		if(args.length<1){
			System.out.println("[����]java StringTest ���ڿ�1 ���ڿ�2 ...");
			return;
		}
		for(int i=0; i<args.length; i++) System.out.print(args[i]+" ");
		System.out.println();
		
		//������ ����
		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length; j++){
				//�빮���� ��� �����߻�! �빮�ڰ� �ƽ�Ű�ڵ� ���� �ҹ��ں��� �۱⶧���� Xy.compareTo("ab")�ϸ� ������ ����. -> IgnoreCase�ٿ������.
				if(args[i].compareToIgnoreCase(args[j])>0){
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
					}
			}
		}
		
		//������������ ����
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