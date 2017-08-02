package aa.bb.ff;

public class InterMain {

	public static void main(String[] args) {
		InterRadio radio= new InterRadio();
		radio.volUp(10);
		radio.volOff();
		radio.volResume();
		radio.volDown(5);
		radio.show();
	}
}
