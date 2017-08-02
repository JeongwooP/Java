package aa.bb.ee;

public class AnimalMain {
	public static void main(String[] args) {
		Ani_Cow cow = new Ani_Cow();
		System.out.println(cow.name() + " " + cow.action() + " " + cow.eat() + "먹음");
		cow.print();
		
		System.out.println();
		Ani_Lion lion = new Ani_Lion();
		System.out.println(lion.name() + " " + lion.action() + " " + lion.eat() + "먹음");
		lion.print();
		lion.eatOther();
		
		System.out.println();
		AnimalFind animalFind = new AnimalFind();
		animalFind.find(cow);
		System.out.println();
		animalFind.find(lion);
		
		System.out.println();
		Ani_Dog dog = new Ani_Dog();
		System.out.println(dog.name());
		
		Ani_Wolf wolf = new Ani_Wolf();
		animalFind.find(wolf);
	}
}
