package pack;

public class Animal {
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1;
	
	public Animal(){
		//생성자는 내용이 없을 경우 생략 가능.(컴파일러가 만든다.)
	}
	
	public Animal(int leg){	//생성자 오버로딩 0
		
	}
	
	public Animal(int leg, String name){	//생성자 오버로딩 0
		
	}
	
	public Animal(int leg, int age){	//생성자 오버로딩 0
		
	}
	
	public Animal(String name, int leg){	//생성자 오버로딩 0
	
	}
	
	public void display(){
		System.out.println("leg:" + leg + ",age:" + age + ",name:" + name);
	}
	
	public void display(int age){	//Method overloading
		this.age = age;
		System.out.println("leg:" + leg + ",age:" + age + ",name:" + name);
	}
	
	public void display(String aname){	//Method overloading
		name = aname;
		System.out.println("leg:" + leg + ",age:" + age + ",name:" + name);
	}
	
	public void display(int age, String aname){	//Method overloading
		this.age = age;
		this.name = name;
		System.out.println("leg:" + leg + ",age:" + age + ",name:" + name);
	}
	
	/*public void display(String name, int age){	//Method overloading
		this.age = age;
		this.name = name;
		System.out.println("leg:" + leg + ",age:" + age + ",name:" + name);
	}
	
	public void display(int leg){	//x
		System.out.println("leg:" + leg + ",age:" + age + ",name:" + name);
	}
	
	public int display(int leg){	//x
		System.out.printl("leg:" + leg + ",age:" + age + ",name:" + name);
	}*/
	
	public void aa(){
		System.out.println(MOUTH);
		System.out.println(leg);
	}
	
	public static void bb(){	//static 매소드는 static 멤버만 참조 가능
		System.out.println(MOUTH);
		//System.out.println(leg);
	}
	
}
