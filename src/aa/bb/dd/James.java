package aa.bb.dd;

public class James extends Student{
	String addr = "서울시";
	String name;
	
	public James() {
		System.out.println("제임스 생성자");
		name = "제임스";
	}
	
	@Override	//Annotation : 어떠한 기능을 제공
	void study() {
		System.out.println("제임스의 스터디");
	}
	
	@Override
	public String toString() {
		return "난 제임스 toString이야";
	}
}
