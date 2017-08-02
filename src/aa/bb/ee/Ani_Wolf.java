package aa.bb.ee;

public class Ani_Wolf extends Ani_Dog{
	@Override
	public String action() {	//오버라이드 강요
		return "밤";
	}
	
	@Override
	public String eat() {
		return "먹이";
	}
	
	@Override
	public String name() {	//오버라이드 선택
		return "늑대";
	}
}
