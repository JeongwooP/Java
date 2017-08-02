package aa.bb.ff;

public class Flyer_Airplane implements Flyer{
	public void fly() {
		System.out.println("엔진소리와 함께 구름속으로");
	}
	
	@Override
	public boolean isAnimal() {
		return false;
	}
}
