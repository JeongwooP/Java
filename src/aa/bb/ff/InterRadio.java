package aa.bb.ff;

public class InterRadio implements InterAdvanceVol{
	private int v = 0;
	
	@Override
	public void volUp(int v) {
		this.v += v;
	}
	
	@Override
	public void volDown(int n) {
		this.v -= v;
	}
	
	@Override
	public void volOff() {
		System.out.println("소리 끄기");
	}
	
	@Override
	public void volResume() {
		System.out.println("소리 켜기");		
	}
	
	public void show(){
		System.out.println("현재 볼륨은 " + v);
	}
}
