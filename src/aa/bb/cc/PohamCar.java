package aa.bb.cc;

public class PohamCar {	//부품들이 모인 안성차 생성 : 포함관계
	int speed = 0;
	String ownerName, turnShow;
	PohamHandle handle = new PohamHandle(); //클래스의 포함을 사용
	
	public PohamCar() {
		
	}
	
	public PohamCar(String name){
		ownerName = name;
	}
	
	public void turnHandle(int q){	//q: 회전량
		/*
		if(q > 0) turnShow = handle.rightTurn(q);
		if(q < 0) turnShow = handle.leftTurn(q);
		if(q==0) turnShow = handle.stright(q);
		*/
		if(q > 0)
			turnShow = handle.rightTurn(q);
		else if(q < 0)
			turnShow = handle.leftTurn(q);
		else //if(q == 0)
			turnShow = handle.stright(q);
	}
}
