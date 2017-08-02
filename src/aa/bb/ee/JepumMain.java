package aa.bb.ee;

public class JepumMain {
	public static void main(String[] args){
		//Jepum jepum = new Jepum();
		Jepum jepum = null;
		
		JepumTv tv = new JepumTv();
		jepum = tv;
		jepum.volumeControl();
		jepum.volumeShow();
		
		System.out.println();
		JepumRadio radio = new JepumRadio();
		jepum = radio;
		radio.volumeControl();
		radio.volumeShow();
	}
}
