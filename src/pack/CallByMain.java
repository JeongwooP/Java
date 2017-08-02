package pack;

public class CallByMain {
	public static void main(String[] args) {
		//매소드 호출 시 값 전달하기1 - 기본형 전달
		CallBy1 my = new CallBy1();
		CallBy2 your = new CallBy2();
		
		System.out.println("원래 a:" + my.a + ", b:" + my.b);
		
		your.ex(my.a, my.b);	//인수로 기본형(값을 전달)
		System.out.println("1. 수행 후  a:" + my.a + ", b:" + my.b);
		
		System.out.println();
		//매소드 호출 시 갑 전달하기2 - 참조형 전달
		your.ex(my); 	//인수로 참조형(주소를 전달)
		System.out.println("2. 수행 후 a:" + my.a + ", b:" + my.b);
		
		System.out.println();
		System.out.println("원래 c[0]:" + my.c[0] + ", my.c[1]" + my.c[1]);
		your.ex(my.c);	//인수로 참조형(주소를 전달)
		System.out.println("3. 수행 후 c[0]:" + my.c[0] + ", my.c[1]" + my.c[1]);
	}
}
