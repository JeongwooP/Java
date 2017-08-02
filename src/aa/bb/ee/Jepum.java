package aa.bb.ee;

public abstract class Jepum {
	public int volume = 0;
	
	public Jepum(){
		System.out.println("추상 클래스 생성자");
	}
	
	abstract public void volumeControl();	//body가 없는 메소드 == abstract method
	
	public void volumeShow(){	//일반 메소드
		System.out.println("소리 크기:" + volume);
	}
}
