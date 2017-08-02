package aa.bb.ff;

public class Flyer_Bird implements Flyer{
	
	@Override
	public void fly() {
		System.out.println("날개를  휘저으며 날아감");
	}
	
	@Override
	public boolean isAnimal() {
		return true;
	}
	
}
