package aa.bb.gg;

public class SaramMain {

	public static void main(String[] args) {
		Saram saram = new Saram();
		System.out.println(saram.getIr());
		
		System.out.println();
		Kildong kildong = new Kildong();
		Saram saram2 = kildong.getSaram();
		System.out.println(saram2.getIr());
	}
}
