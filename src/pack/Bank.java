package pack;

public class Bank {
	private int money = 1000;	//잔고
	
	int imsi = 1;
	public int imsi2 = 2;
	
	public Bank() {
		
	}
	
	public Bank(int money){
		this.money += money;
	}
	
	public void deposit(int amount){//입금
		if(amount > 0) money += amount;
	}
	
	public void withdraw(int amount){//출금
		if((amount > 0) && (money - amount >0)){
			money -= amount;
		}else{
			System.out.println("출금액이 너무 많습니다.");
		}
	}
	public int getMoney(){	//잔고를 확인
		return money;
	}
}
