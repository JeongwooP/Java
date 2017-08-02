package company;

public abstract class Employee2 {
	private String irum;
	private int nai;
	
	public Employee2(String irum, int nai){
		this.irum = irum;
		this.nai = nai;
	}
	
	abstract double pay();
	
	abstract void print();
	
	public void display(String irum, int nai){
		System.out.println(irum + ", " + nai);
	}
}
