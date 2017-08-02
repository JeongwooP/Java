package company;

public class SalesMan extends Regular {
	private int sales;
	private double commission;

	public SalesMan(String irum, int nai, int income, int sales, double commission) {

		super(irum, nai, income);

		this.sales = sales;
		this.commission = commission;

	}

	@Override
	public double pay() {
		return super.pay() + sales * commission;
	}

	public void print() {
		System.out.println("수령액: " + (int) pay());
	}
}
