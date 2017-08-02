package aa.bb.gg;

public class Kildong {
	public Saram getSaram(){
		//return new Saram();
		return new Saram()
		{ //내부 익명 클래스
			int a = 10;
			public void aa(){
				
			}
			@Override
			public String getIr() {
				return "홍길동";
			}
		};
	}
}
