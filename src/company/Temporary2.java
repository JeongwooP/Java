package company;

public class Temporary2 extends Employee2{
	private int ilsu;
	private int ildang;
	
	public Temporary2(String irum, int nai, int ilsu, int ildang){
		super(irum, nai);
		
		super.display(irum, nai);
		
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	@Override
	public double pay() {
		
		return ilsu * ildang;
	}
	
	@Override
	public void print() {
		System.out.println("월급: " + pay());
		
	}
}
