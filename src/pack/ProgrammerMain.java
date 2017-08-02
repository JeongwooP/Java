package pack;

public class ProgrammerMain {

	public static void main(String[] args) {
		System.out.println("이런 저런 작업을 하다가...");
		
		//Programmer 객체 생성
		Programmer tom = new Programmer();
		tom.displayData();
		
		System.out.println();
		
		Programmer oscar = new Programmer(25);
		oscar.displayData();
		
		System.out.println();
		
		Programmer john = new Programmer("컴도사");
		john.displayData();
		
		//셋터, 겟터
		john. setAge(22);
		System.out.println(john.getAge());
		System.out.println("모토는 " + john.motto);
		
		System.out.println("모토는 " + Programmer.motto);	//static 멤버는 클래스 이름으로 직접 부를 수 있다.
	
		System.out.println("파이는 " + john.PI);
		//john.pi = 123.456; -> final로 고정시켜서 에러다.
		
		System.out.println("메세지는 " + Programmer.MSG);
	}

}
