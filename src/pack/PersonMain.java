package pack;

public class PersonMain {

	public static void main(String[] args) {
		Person kildong = new Person();
		System.out.println(kildong.irum);
		//System.out.println(kildong.nai); nai가 private 접근제어지시자 때문에 호출불가.
		kildong.showData();
		
		System.out.println();
		Person tom = new Person("톰");
		tom.showData();
		
		System.out.println();
		Person james = new Person("제임스", 33, "역삼2동");
		james.showData();
		
		System.out.println();
		Person john = new Person("존", 35, "역삼3동");
		john.showData();
	}

}
