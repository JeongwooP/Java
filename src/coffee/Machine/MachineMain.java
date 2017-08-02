package coffee.Machine;

import java.util.Scanner;

public class MachineMain {

	
	public static void main(String[] args) {
		
		while(true){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("동전을 입력하세요. ");
			int coin = sc.nextInt();
			
			System.out.println("몇 잔을 원하세요? ");
			int cup = sc.nextInt();
			
			if(coin - 200*cup < 0){
				System.out.println("동전이 모자랍니다.");
				System.exit(0);
			}
			
		Machine result = new Machine();
		
		result.cupCount(cup);
		
		result.box.calc(coin, cup);
		
		result.showData(coin);
		
		System.out.println("커피량과 설탕량을 넣어주세요. ");
		
		int coffee = sc.nextInt();
		
		int sugar = sc.nextInt();
		
		result.coffeeandsugar(coffee, sugar);

	

	}

 }
}
