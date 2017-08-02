package basic;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("출발");
		System.out.print("대한");
		System.out.println("민국");
		System.out.println("대한\n\n민국");
		//한 줄 주석
		/*
		 여러
		 줄 주석
		 */
		System.out.println("주석은 실행과는 상관없다");
		
		System.out.println("변수 연습-------");
		//자료형 - 기본형(상수값을 직접 기억), 참조형(객체의 주소 기억)
		byte v1;
		v1 = 5;	//상수 5를 1byte 기억장소 v1에 기억하라
		v1 = 10;
		v1 = Byte.MAX_VALUE;
		v1 = 127; //-128 ~ 127
		System.out.println(v1);
		
		System.out.println();
		short v2 = 10;	//상수를 2byte 기억장소 v2에 기억하라
		v2 = 32767; //-32768 ~ 32767
		System.out.println(v2);
		
		System.out.println();
		int v3 = 100;	//상수를 4byte 기억장소 3v에 기억하라
		v3 =-2147483648; //-2147483 ~ 2147483647
		System.out.println(v3);
		
		System.out.println();
		long v4 = 20;	//상수를 8byte 기억장소 v4에 기억하라
		v4 = 2147483648L;
		System.out.println(v4);
		
		System.out.println("casting : 강제 형변환");
		byte b1 = (byte)128;
		System.out.println("b1 : " + b1);
		byte b2 = 10;
		byte b3 = (byte)(b2 + 1);
		System.out.println("b3 : " + b3);
		
		System.out.println();
		short s2 = 10;	//자동 형변환(promotion)
		int i1 = s2;
		short s3 = (short)i1;
		
		System.out.println("\n실수 처리-------------------");
		double d1 = 10.5;	//8byte 실수 기억장소에 실수값 기억하라
		System.out.println("d1 : " + d1);
		d1 = 123.5678123123123123;
		d1 = 12.3;
		d1 = 10;	//정수는 실수화(자동 형변환)
		System.out.println("d1 : " + d1);
		
		System.out.println();
		float f1 = 3.5F;	//4byte 실수 기억장소에 실수값 기억하라
		f1 = (float)4.5;
		
		int i2 = (int)3.8;	//버림
		System.out.println("i2 : " + i2);
		
		System.out.println();
		double result = 4.5 * 10;//연산 시 큰타입으로 자동 형변환
		result = (int)4.5 * 10;
		System.out.println("result : " + result);  
		
		System.out.println();
		boolean bu1 = true;
		bu1 = false;
		System.out.println(bu1);

		System.out.println();
		char a1 = 'a';	//"a", 'abc' <== X
		System.out.println(a1 + " " + (int)a1 + " " + (char)97);	//Ascii code
		
		//bcbsilfd : 기본형 자료타입
		
		System.out.println();
		//문자열 
		String msg = "홍길동";	//String은 참조형이나 기본형 처럼 사용 가능
		System.out.println(msg);
		
		}
}
