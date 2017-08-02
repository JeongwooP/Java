package aa.bb.dd;

public class Student extends Object{	// extends Object은 일반적으로 적지 않는다.
	@Override
	public String toString() {	//메소드 오버라이딩(재정의)
		return "안녕하세요";
	}
	
	String name;
	protected String gender;
	
	public Student() {
		name = "홍길동";
		gender = "남";
	}
	
	void study(){
		System.out.println("자바는 클래스가 기본");
	}
}
