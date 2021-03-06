package aa.bb.dd;

public class PolyProductMain {
	public static void main(String[] args) {
		PolyProduct product = null;
		
		PolyRadio radio = new PolyRadio();
		radio.setVolume(6);
		System.out.println(radio.getVolume());
		radio.volumeControl();
		
		System.out.println();
		PolyTv tv = new PolyTv();
		tv.setVolume(10);
		System.out.println(tv.getVolume());
		tv.volumeControl();
		tv.tvShow();
		
		System.out.println("\n다형성-------");
		product = radio;
		product.volumeControl();
		System.out.println();
		product = tv;
		product.volumeControl();
		
		System.out.println();
		PolyProduct p[] = new PolyProduct[2];
		p[0] = radio;
		p[1] = tv;
		for(PolyProduct i:p){
			i.volumeControl();
		}
	}
}
