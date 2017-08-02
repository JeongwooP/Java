package company;

public class SalesMan2 extends Regular2{
	private int sales;
	private double commission;
	
	public SalesMan2(String irum, int nai, int sales, double commission){
		super(irum, nai, sales);
		super.display(irum, nai);
		
		this.commission = commission;
		this.sales = sales;
	}
	
	@Override
	public double pay() {
		
		return super.pay() * commission;
	}
	
	@Override
	public void print() {
		System.out.println("수령액: " + (int)pay());;
	}
}
