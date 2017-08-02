package aa.bb.dd;

public class GrandFa {
	private int nai = 80;	//private는 상속되지 않는다.
	public String gabo = "상감청자";
	protected String gahun = "바르게 살자";
	
	public GrandFa(){
		System.out.println("할아버지 생성자");
	}
	
	public GrandFa(String msg){
		//this(); 가 있다.
		System.out.println("메세지:" + msg);
	}
	
	
	public String say(){
		return "할아버지 말씀: 졸지 마";
	}
	
	public void eat(){
		System.out.println("밥은 맛있게 먹자");
	}
	
	public int getNai(){
		return nai;
	}
}
