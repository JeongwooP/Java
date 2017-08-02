package aa.bb.ff;

public interface Resume {	//표준 이력서 양식
	String SIZE = "A4";	//public final static 이다.
	
	void setIrum(String irum);
	void setPhone(String phone);
	void print();
	
	//java8 이후 
	static void changeData(){
		System.out.println("스테틱 메소드 처리");
	}
	
}
