package pack;

public class Person {
	public String irum;
	private int nai;
	private String juso;
	
	public Person(){
		irum = "홍길동";
		nai = 25;
		juso = "역삼1동";
	}
	public Person(String name){	//생성자 오버로딩(overload)
		irum = name;
	}
	public Person(String irum, int nai, String juso){	//생성자 오버로딩
		this.irum = irum;
		this.nai = nai;
		String addr = juso;
		this.juso = juso;
		
	}
	
	public void showData(){
		System.out.println("이름:" + irum + ",나이:" + nai + ",주소:" + juso);
	}
}
