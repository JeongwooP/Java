package company;

public class Manager2 extends Regular2{
	private double incentive;
	
	public Manager2(String irum, int nai, int income, int incentive){
		super(irum, nai, income);
		super.display(irum, nai);
		
		this.incentive = incentive;
	}
	
	@Override
	public double pay() {
		if (incentive < 2500000) {
			if (incentive >= 2000000) {
				this.incentive = super.pay() * 0.5;
			} else {
				this.incentive = super.pay() * 0.4;
			}
		} else {
			this.incentive = super.pay() * 0.6;
		}
		
		return this.incentive;
	}
	
	@Override
	public void print() {
		System.out.println("수령액: " + (int)pay());
		
	}
}
