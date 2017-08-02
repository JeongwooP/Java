package aa.bb.gg;

public class Outer {
	private int a;
	private Inner inner;
	
	public Outer() {
		a = 10;
		inner = new Inner();
	}
	
	public void aa(){
		System.out.println("외부에 있는 aa 메소드");
		bb();
		inner.cc();
		System.out.println("외부 a:" + a + ",내부 b:" + inner.b);
	}
	
	private void bb(){
		System.out.println("외부에 있는 bb 메소드");
	}
	
	public class Inner {	//내부 클래스
		private int b;
		
		public Inner(){
			b = 20;
		}
		
		public void cc(){
			System.out.println("내부에 있는 cc 메소드");
			System.out.println("외부 a:" + a + ",내부 b:" + b);
			bb();
		}
		
		class InnerInner{
			//내부 클래스 내에 내부 클래스 선언 가능
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.aa();
	}

}
