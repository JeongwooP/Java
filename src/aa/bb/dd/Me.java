package aa.bb.dd;

public final class Me extends Father{	//sub클래스를 가질 수 없다. +final은 상속 불가로 된다.
	final int KBS = 9;	//+final 멤버필드 수정 불가
	
	public Me(){
		System.out.println("내 생성자랍니다.");
	}
	
	public final void play(){	//메소드에 final는 play에 대해 override 할 수 없다는 의미가 된다.
		System.out.println("놀이하기");
	}
}

