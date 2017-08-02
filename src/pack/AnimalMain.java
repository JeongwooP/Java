package pack;

public class AnimalMain {

	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.display();
		tiger.display(5);
		tiger.display("호랑이");
		tiger.display(3, "호랭이");
		
		Animal lion = new Animal("사자", 4);
		Animal hen = new Animal(2);
		
		System.out.println();
		System.out.println(Animal.MOUTH);
		hen.aa();
		Animal.bb();
		
	}

}
