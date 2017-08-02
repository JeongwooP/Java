package pack;

public class Person2Main {

	public static void main(String[] args) {
		Person2 길동 = new Person2();
		System.out.println(길동.irum);
		길동.showData();
		길동.irum = "신기해";
		길동.showData();				
		
		System.out.println("\n셋터와 겟터 : private멤버를 대상으로 한다");
		//System.out.println(길동.nai); //private로 할 수 없다.

		길동.setNai(123, 28);	//셋터를 이용해 private 멤버 값 입력
		길동.showData();	
		System.out.println(길동.getNai());	//겟터를 이용해 private 멤버값을 참조
		
	}

}
