package aa.bb.ff;

public class Ball extends FlyerAdapter{
	@Override
	public void fly() {
		System.out.println("공이 관중석으로 날아감");
		super.fly();
	}
	
	public static void main(String[] args) {
		Ball ball = new Ball();
		ball.fly();
	}
}
