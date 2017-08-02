package company;

public class Regular2 extends Employee2{
	private int salary;
	
	public Regular2(String irum, int nai, int income){
		super(irum, nai);
		
		super.display(irum, nai);
		
		this.salary = income;
	}
	
	@Override
	public double pay() {
		
		return salary;
	}
	@Override
	public void print() {
		System.out.println("급여: " + pay());
		
	}
}
