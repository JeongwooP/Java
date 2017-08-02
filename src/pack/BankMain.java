package pack;

import java.util.Calendar;

public class BankMain {

	public static void main(String[] args) {
		Bank tom = new Bank();
		System.out.println("tom 잔고: " + tom.getMoney());
		tom.deposit(5000);
		tom.withdraw(3000);
		System.out.println("tom 잔고: " + tom.getMoney());
	
		System.out.println();
		Bank oscar = new Bank(5000);
		System.out.println("oscar 잔고:" + oscar.getMoney());
		oscar.withdraw(8000);
		oscar.withdraw(2000);
		System.out.println("oscar 잔고 : " + oscar.getMoney());
		
		System.out.println("\n객체의 주소확인-------");
		System.out.println("tom의 주소:" + tom + " " + tom.hashCode());
		System.out.println("oscar의 주소:" + oscar + " " + oscar.hashCode());
		
		Bank james = null;
		System.out.println("james의 주소: " + james);
		//james.withdraw(1000);	//NullPointerException
		james = oscar;	//주소 치환 (type이 일치)
		System.out.println(james + " " + oscar);
		james.withdraw(1000);
		System.out.println("james 잔고: " + james.getMoney());
		System.out.println("oscar 잔고: " + oscar.getMoney());
		//Animal cat = oscar; //xtype mistmatch
		
		System.out.println();
		if(james == tom)	//주소의 비교
			System.out.println("두 개는 같은 객체의 주소");
		else
			System.out.println("둘은 다른 주소");
		
		if(james instanceof Bank)	//instanceof: 클래스 타입 비교연산자
			System.out.println("Bank 타입이네요.");
		else
			System.out.println("Bank 타입 아니네요.");
		
		System.out.println("\nString type의 비교");
		int aa = 1;			//기본형
		String ss1 = "kor";	//참조형
		String ss2 = new String();
		ss2 = "kor";
		String ss3 = new String("kor");
		
		System.out.println(ss1 + " " + ss2 + " " + ss3);
		if(ss1 == ss2)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		if(ss1 == ss3)
			System.out.println("같다");
		else
			System.out.println("다르다");
	
		System.out.println();
		if(ss1.equals(ss2))
			System.out.println("같음2");
		else
			System.out.println("다름2");
		
		//if(ss1.equals(ss3))	//대소문자를 구분
		if(ss1.equalsIgnoreCase(ss3))	//대소문자를 구분하지 않음
			System.out.println("같다2");
		else
			System.out.println("다르다2");
		
		//==주소의 비교, equals()는 문자열 값을 비교한다.
		
		System.out.println("\n배열관련-------");
		int a = 1;	//a는 기본형 변수
		//int ar1[] = new int[5];
		int ar1[] = {1,2,3,4,5};	//배열명은 참조형 변수
		System.out.println(ar1);
		
		System.out.println();
		int [][] ar2 = {{1,2,3},{4,5,6}};
		System.out.println(ar2 + " " + ar2[0] + " " + ar2[0][0]);
		
		//접근지정자 영향을 미치는 범위
		//System.out.println(tom.money);
		System.out.println(tom.imsi);
		System.out.println(tom.imsi2);
	}

}
