package aa.bb.cc;

public class PohamHandle {
	int quantity;	//회전량
	
	public PohamHandle(){
		quantity = 0;
	}
	
	public String leftTurn(int quantity){
		this.quantity = quantity;
		return "좌회전";
	}
	
	public String rightTurn(int quantity){
	this.quantity = quantity;
	return "우회전";
	}
	
	public String stright(int quantity){
	this.quantity = quantity;
	return "직진";
	}
}
