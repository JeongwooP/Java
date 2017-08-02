package basic;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("산술 연산자 연습");
		int a = 5;	// = 치환연산자
		int b = 3;
		int c = a + b;
		System.out.println(c);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);	//몫
		System.out.println(a % b);	//나머지
		System.out.println(a / (double)b);
		System.out.println(20 / 3);
		System.out.println(20 / 3.0);
		
		//System.out.println(a / 0);	//err : / by zero
		System.out.println(a / 0.0);	//Infinity
		System.out.println(a % 0.0);	//NaN
		
		System.out.println(3 + 4 * 5);	// * , / 가 우선순위 높다
		System.out.println((3 + 4) * 5);	//()를 두르면 우선순위 1등
		
		System.out.println();
		String ss1 = "대한";
		String ss2 = "민국";
		String ss3 = ss1 + ss2;	//문자열 더하기
		System.out.println(ss3);
		
		System.out.println(ss3 + " " + 82);	//이때 82는 문자, 앞에 문자가 왔기 때문
		System.out.println(ss3 + " " + 80 + 2);	//대한민국 802
		System.out.println(ss3 + " " + (80 + 2));
		String ss4 = "5" + 6;
		System.out.println(ss4);
		System.out.println(ss4 + 10);
		int ia = Integer.parseInt("5") + 2;	//향뱐환 : 문자열 -> 숫자
		System.out.println(ia);
		String ss5 = Integer.toString(5) + 6;	//형변환 : 숫자 -> 문자열
		System.out.println(ss5);
		
		System.out.println("\n누적 -------");
		int no = 1;
		no = no + 1;
		no += 1;	//no -= 1	no *= 2	no /= 2
		no++;	//후위 증가연산자	no--	<= 증감연산자
		++no;	//전위 증가연산자
		System.out.println(no);
		
	/*	//증감연산에 대하여
		int imsi = 5;
		int result = ++imsi + 1;
		System.out.println(imsi + " " + result);
		

		int imsi2 = 5;
		int result2 = imsi2++ + 1;	//권장하지 않음, 증감연산자는 혼자 노는게 낫다.
		System.out.println(imsi2 + " " + result2);	*/
		
		System.out.println("부호에 대하여");
		int imsi3 = 3;
		System.out.println(imsi3);
		System.out.println(-imsi3);
		System.out.println(imsi3  * -1);
	}

	public void abc(){
		System.out.println("난 abc");
	}
}
