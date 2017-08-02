package coffee.Machine;

import java.util.Scanner;

public class Machine2 {
	private int cupCount;
	private int coffee = 20;
	private int sugar = 10;
	
	public void showData(){
		
		while(true){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("동전을 입력하세요. ");
				int coin = sc.nextInt();
				
			System.out.println("몇 잔을 원하세요? ");
				int cup = sc.nextInt();
				this.cupCount = cup;
				
			if(coin - 200*cup < 0){
				System.out.println("동전이 모자랍니다.");
				System.exit(0);
			}
			
			CoinIn2 box = new CoinIn2();
			
			System.out.println("커피" + cupCount + "잔과 " + "잔돈 " + box.calc(coin, cupCount) + "원");	
			
		}
	}
}
