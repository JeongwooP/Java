package aa.bb.cc;

public class PohamCarMain {

	public static void main(String[] args) {
		//PohamCar abc = new PohamCar();
		
		PohamCar tom = new PohamCar("톰");
		tom.turnHandle(20);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity); //tom.handle.getquantity
		
		tom.turnHandle(-10);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		
		PohamCar james = new PohamCar("제임스");
		james.turnHandle(0);
		System.out.println(james.ownerName + "의 회전량은 " + james.turnShow + " " + james.handle.quantity);
	}

}
