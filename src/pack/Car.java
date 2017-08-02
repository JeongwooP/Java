package pack;

public class Car {	//[접근지정자][기타제한자] class 클래스명
	int wheel;	//멤버필드(멤버변수). 초기치를 안주면 0을 가짐.->(멤버필드만)
	private int airBag = 1;	//[접근지정자][기타제한자] type 멤버필드명 [=초기치]
	private int speed;	//캡슐화(클래스내에서만 참조할 수 있다.)
	public String irum;
	
	public Car(){	//생성자: 클래스와 이름이 같고 반환형이 없는(void) 메소드
		//객체 생성시 호출
		//초기화를 담당
		System.out.println("난 생성자"); 
		wheel = 4;
	}
	
	public void abc()	{//(멤버) 메소드 : [접근지정자][기타제한자] 반환형 메소드명([인수...]){}
		System.out.println("abc 메소드");
		System.out.println("바퀴 수는 " + wheel);
		System.out.println("에어백 수는" + airBag);	//private 멤버
		def();	//private 메소드 호출
		int kor = 100;	//지역변수는 초기치를 줘야 한다.
		{
			int eng = 90; //블럭 안에서만 사용가능
		}
		System.out.println("kor: " + kor);
		
		int jum = 88;
		int result = korea(jum);	//실인수(actual argument)를 담아서 메소드 호출
		System.out.println("result: " + result);
		
		nice();
	}
	
	private void def(){
		System.out.println("def 메소드");
	}
	
	private int korea(int jumsu){	//메소드명(인수= 인자= argument= parameter)(가인수)
		System.out.println("넘겨받은 점수는 " + jumsu);
		return jumsu + 5;
	}
	
	private void nice(){
		System.out.println("nice1");
		int imsi = 2;
		if(imsi % 2 == 0){
			return;
		}
		System.out.println("nice2");
	}
	void ghi(){

	}
}
