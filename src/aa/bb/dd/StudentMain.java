package aa.bb.dd;

import java.lang.*;	//java.lang은 생략 가능

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.toString());	//st.toString()은 주소 반환 
		System.out.println(st);				//toString()생략해도 같다. st도 주소값을 반환하기에...
		
		System.out.println();
		Tom tom = new Tom();
		System.out.println(tom.name + " " + tom.gender);
		tom.study();
		
		System.out.println();
		James james = new James();
		System.out.println(james.name + " " + james.gender);
		james.study();
		
		System.out.println(tom + " " + james);
	}

}
