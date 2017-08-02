package company;

public class Manager extends Regular {
	private double incentive;

	public Manager(String irum, int nai, int income) {
		super(irum, nai, income);

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

	public void print() {
		System.out.println("수령액: " + (int)pay());
	}
}
