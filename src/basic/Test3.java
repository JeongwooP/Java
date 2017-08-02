package basic;

public class Test3 {

	public static void main(String[] args) {
		//관계, 논리, 기타 연산자
		int a = 5;
		boolean k = a > 3;
		System.out.println(a > 3);
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a != 3);
		
		System.out.println();
		int b = 10;
		System.out.println(a > 3 && b <= 5);	//논리곱(and)
		System.out.println(a > 3 || b <= 5); 	//논리합(or)
		
		System.out.println("시프트 연산");
		int ii = 8, ij = 0;
		System.out.println(ii + " " + ij);
		System.out.println("ii:" + ii + " " + Integer.toBinaryString(ii));
		ij = ii << 1;	//좌측으로 1비트 이동. 남는 우측은 0으로 채움
		System.out.println("ij:" + ij + " " + Integer.toBinaryString(ij));
		ij = ii >> 2;	//우측으로 2비트 이동. 남는 우측은 부호와 같게 채움
		System.out.println("ij:" + ij + " " + Integer.toBinaryString(ij));
		ij = ii >>> 2;	//우측으로 2비트 이동. 남는 우측은 부호와 0으로 채움
		System.out.println("ij:" + ij + " " + Integer.toBinaryString(ij));
		
		System.out.println();
		int x, y, z;
		x = y = z = 5;
		System.out.println(x + " " + y + " " + z);
		
		System.out.println();
		System.out.println(a > 3 || b < 5 + 2);	
		//() > 산술 > 관계 > 논리 > =(치환)
		System.out.println("삼항연산자");
		int kbs = 9;
		int result = (kbs >= 5)?100:200;	//변수=(조건)?참값:거짓값
		System.out.println(result);
	
		//매소드(함수) 호출
		aa();
		bb(5);
		System.out.println("프로그램 종료");
	}
	
	public static void aa(){	//매소드
		System.out.println("aa");
	}
	
	public static void bb(int arg){
		int sbs = arg;
		System.out.println("bb - " + sbs);
	}

}
