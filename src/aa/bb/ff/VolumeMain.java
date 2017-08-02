package aa.bb.ff;

public class VolumeMain {

	public static void main(String[] args) {
		//Volume volume = new Volume();	//인터페이스는 뉴 할 수 럾다.
		Volume volume = null;
		
		Radio radio = new Radio();
		Tv tv = new Tv();
		
		volume = radio;
		volume.volumeUp(5);
		volume.volumeDown(3);
		
		System.out.println();
		volume = tv;
		volume.volumeUp(5);
		volume.volumeDown(2);
	}

}
