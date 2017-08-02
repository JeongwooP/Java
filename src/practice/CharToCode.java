package practice;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';	//char ch = 65;
		int code = (int)ch;	//ch�뿉 ���옣�맂 媛믪쓣 int���엯�쑝濡� 蹂��솚�븯�뿬 ���옣�븳�떎.
		
		System.out.printf("%c = %d(%#X) %n", ch, code, code);
		
		char hch = ' ';	//char hch = 0xAC00;
		System.out.printf("%c = %d(%#X)%n", hch, (int)hch, (int)hch);
	}

}
