package pack;

public class Programmer {
	//public String nickName = "천재";
	public String nickName; //초기갑은 null
	//private int age = 0;
	private int age;	//초기값은 0
	String spec = "자바 전문가";
	
	public static String motto = "빠지자";
	public final double PI = 3.14;	//final 붙인 건 대문자로 쓰자.
	public final static String MSG = "자바 만세";
	
	public Programmer(){
		System.out.println("생성자 : 초기화를 담당");
	}
	
	public Programmer(int age){	//생성자 오버로딩(overloading)
		this.age = age;
	}
	
	public Programmer(String nickName){	//생성자 오버로딩(overloading)
		//this();	//인자가 없는 생성자를 호출
		this(33); //인자(int)가 있는 생성자를 호출 
		this.nickName = nickName;
	}
	
	public void displayData(){
		System.out.println("별명이 " + nickName + ", 나이는 " + age + ", 스펙은 " + spec);
	}
	
	//setter, getter : private 멤버가 해당
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
}
