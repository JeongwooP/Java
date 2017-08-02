package aa.bb.dd;

public class PolyProduct {	//가전 제품의 원형 클래스
	private int volume = 0;
	
	public void volumeControl(){	//자식 클래스가 오버라이드 하기를 기대하며 작성
		//자식 클래스에서 코드를 기술
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
}
