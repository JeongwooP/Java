package basic;

public class Test4 {

	public static void main(String[] args) {
		//논리연산 처리 시 주의사항
		boolean a = true, b = false, c;
		c = a||b;
		System.out.println(c);
		c = a && b;
		System.out.println(c);
		boolean b1, b2;
		b1 = aa();
		System.out.println(b1);
		System.out.println(bb());
		
		System.out.println("\n주의할 점-----");
		b2 = aa() || bb();
		//b2 = bb() || aa(); aa하기 전에 완료된다.
		System.out.println(b2);
		
		System.out.println();
		//b2 = aa() && bb();
		b2 = bb() && aa();	//미리 스스로 판단한다.
		System.out.println(b2);
		
		System.out.println("모든 수행을 원할 시 ---");
		//b2 = aa() | bb();
		b2 = bb() | aa();
		System.out.println(b2);
		
		System.out.println();
		//b2 = aa() & bb();
		b2 = bb() & aa();
		System.out.println(b2);
	}
	/*	int re = ss(5);
	}
	public static int ss(int i){
		System.out.println("ss");
		return i;
	} */
	
	public static boolean aa(){
		System.out.println("aa 수행");
		return true;
	}
	
	public static boolean bb(){
		System.out.println("bb 처리");
		return false;
	}
}





