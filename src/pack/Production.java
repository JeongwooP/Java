package pack;

public class Production {
	public String name;
	private int price;
	private String productionDay;
	
	public Production(){
		
	}
	
	public Production(String name){
		this.name = name;
	}
	
	public Production(int price){
		this.price = price;
	}
	
	public Production(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	
	public void SetProductionDay(String password, String productionDay){
		if(password == "Nike.com"){
			this.productionDay = productionDay;
		}
	}
	
	public void display(){
		System.out.println(" 상품명: " + name + " 가격: " + price + " 원 " + " 생산일: " + productionDay);
	}
}
