package company;

public abstract class Employee {
	private String irum;
	private int nai;

	public Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}

	public abstract double pay();

	public abstract void print();

	public void display(String irum, int nai) {
		System.out.print(irum + ", " + nai + ", ");
	}
}
