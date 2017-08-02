package pack;

public class MyMain {

	public static void main(String[] args) {
		// 응용 프로그램 시작
		int kor = 90;
		System.out.println("국어는 " + kor);
		
		//Car 객체 생성(instance)
		Car car1 = new Car();	//클래스명 객체변수 = new 생성자() <- 참조하려는 클래스안에 생성자를 안적어도 된다.
		System.out.println(car1.wheel);
		System.out.println(car1);
		
		car1.abc();
		
	}

}
