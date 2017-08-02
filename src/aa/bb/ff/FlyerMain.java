package aa.bb.ff;

public class FlyerMain {

	public static void main(String[] args) {
		System.out.println("속도: " + Flyer.FAST);
		
		Flyer_Bird bird = new Flyer_Bird();
		bird.fly();
		Flyer_Airplane airplane = new Flyer_Airplane();
		airplane.fly();
		
		System.out.println();
		FlyerUtil.show(bird);
		FlyerUtil.show(airplane);
	}

}
