package aa.bb.dd;

public class DogMain {

	public static void main(String[] args) {
		//Dog dog = new Dog();
		//dog.print();
		Dog dog = null;
		//dog.print();
		
		//HouseDog hd = new HouseDog(); //*argument가 있는 생성자는 꼭 무엇이든지 써놔야 한다.
		 HouseDog hd = new HouseDog("집개");
		 hd.print();
		 hd.show();
		 System.out.println(hd.callName());
		 
		 System.out.println("-----------");
		 WolfDog wd = new WolfDog("늑대");
		 wd.print();
		 wd.show();
		 System.out.println(wd.callName());
		 wd.display();
		 
		 System.out.println("***********");
		 WolfDog wd2 = wd;	//주소를 치환
		 wd2.print();
		 wd2.show();
		 wd2.display();
		 
		 System.out.println();
		 Dog dog3 = new Dog();
		 dog3.print();
		 
		 Dog dog2 = wd;	//자식이 부모에게 객체변수 치환 가능
		 dog2.print();	//오버라이딩 된 메소드만 호출 가능
		 //dog2.show();	x
		 //dog2.display(); x	
		 
		 //WolfDog wd3 = dog3; //불가
		 WolfDog wd3 = (WolfDog)dog2;
		 wd3.print();
		 wd3.show();
	}

}
