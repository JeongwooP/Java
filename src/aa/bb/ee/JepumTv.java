package aa.bb.ee;

public class JepumTv extends Jepum{
	public JepumTv() {
		System.out.println("TV 생성자");
	}
	
	@Override
	public void volumeControl() {	//오버라이드 강요
		System.out.println("TV 소리 조절");
	}
	
	@Override
	public void volumeShow() {	//오버라이드 선택
		System.out.println("소리 크기:" + volume);
	}
}
