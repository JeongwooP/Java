package aa.bb.ee;

public class AnimalFind {
	public void find(Animal animal){
		animal.print();
		
		if(animal instanceof Ani_Cow){	//instance of: 객체탑인 비교연산자 -- true or false
			Animal a = animal;
			System.out.println("소 영역 ---");
			System.out.println("이름: " + a.name());
		}else if(animal instanceof Ani_Lion){
			System.out.println("사자 영역 ---");
			System.out.println("이름:" + animal.name());
		}
		System.out.println(animal.eat());
		System.out.println(animal.action());
		
	}
}
