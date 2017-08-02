package aa.bb.ee;

public class Ani_Lion extends Animal{
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "사자";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "동물";
	}
	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "밤";
	}
	
	public void eatOther(){
		System.out.println("물도 마심");
	}
}
