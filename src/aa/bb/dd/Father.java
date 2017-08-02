package aa.bb.dd;

public class Father extends GrandFa{	//extends (상속받고 싶은 파일) => (단일)상속
	private int nai = 55;
	public String gabo = "물병";
	private int house = 1;
	
	public Father(){
		//super();
		super("부모 호출");
		System.out.println("아버지 생성자 ");
	}
	
	public int getNai() {		//***method override // 부모와 동일한 메소드를 자식이 선언한다.
		return nai;
	}
	
	public int getHouse(){
		return house;
	}
	
	public String say(){
		return "아버지 말씀: 자바가 기본이다";
	}
	
	public void showData(){
		String gabo = "꽃병";	//지역이 우선 gabo => 꽃병, 물병 , 삼가청자
		System.out.println("가보: " + gabo);	//블럭안에서 찾고 없으면 클래스 없으면 부모...
		System.out.println("가보: " + this.gabo);	//처음부터 클래스 메소드에서 찾는다 없으면 부모에서 찾는다
		System.out.println("가보: " + super.gabo);	//처음부터 부모에서 찾는다
		
		System.out.println(say());
		System.out.println(this.say());
		System.out.println(super.say());
	}
}
