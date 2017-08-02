package aa.bb.ff;
//Adapter 클래스: 인터페이스의 추상 메소드를 오버라이드한 추상 클래스
public abstract class FlyerAdapter implements Flyer{
	@Override
	public void fly() {
			
	}
	
	@Override
	public boolean isAnimal() {
		return false;
	}
}
