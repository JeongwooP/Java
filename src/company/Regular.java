package company;

public class Regular extends Employee {
	private int salary;

	public Regular(String irum, int nai, int salary) {
		super(irum, nai);
		super.display(irum, nai);
		this.salary = salary;
	}

	@Override
	public double pay() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("급여 :" + salary);

	}
}
