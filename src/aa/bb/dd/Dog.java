package aa.bb.dd;

public class Dog {
	private String name = "개";
	
	public Dog() {
		System.out.println("난 개");
	}
	
	public Dog(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String callName(){
		return "종류 : " + name;
	}
	
	public void print(){
		System.out.println(name + "는 지구에 살고 있다.");
	}
}
