package coffee.Machine;

import java.util.Scanner;

public class Machine {
	private int cupCount;
	private int coffee;
	private int sugar;	
	
	CoinIn box = new CoinIn();
	
	public void coffeeandsugar(int c, int s){
		this.coffee = c;
		this.sugar = s;
		System.out.println("커피량: " + coffee + ", 설탕량: " + sugar);
	}
	
	public int cupCount(int cupCount){
			this.cupCount = cupCount;
			return this.cupCount;
	}
	

	public void showData(int coin)
	{
		System.out.println("커피" + cupCount + "잔과 " + "잔돈 " + box.calc(coin, cupCount) + "원");

	}
}
