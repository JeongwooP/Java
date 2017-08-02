package basic2;

public class Test10For {

	public static void main(String[] args) {
		// 다중 for
		for(int m=1; m <= 3; m++){
			System.out.println("m=" + m);
			for(int n= 1; n <= 4; n++){
				System.out.print("n=" + n + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(char i =65; i <= 90; i++){
			System.out.print(i + " ");
			for(char j=i; j <= 'Z';  j++){
				System.out.print(j);	
			}
			System.out.println();
		}
		
		//2 ~ 9단 출력
		
		for(int i = 2; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				System.out.print(i + "*" + j + "=" + i*j + " ");
			}
			System.out.println();
		}
			
			
			
			
		//continue, break
		for(int i=1; i <= 10; i++){
			if(i == 3) continue;
			if(i == 5) break;
			//if(i == 5) System.exit(0);
			System.out.println(i);
		}
		
		System.out.println();
		int kk = 0;
		for(;;){	//무한루핑
			kk++;
			System.out.println("출력 " + kk);
			if(kk == 10)break;
		}
		System.out.println("kk는 " + kk);
		
		
		System.out.println();
		aa:for(int i = 1; i <= 3; i++){
			bb:for(int j = 1; j <= 5; j++){
				//if(j==3) continue bb;
				//if(j == 3) continue aa;
				System.out.print(i + ":" + j + " ");
				if(j == 3) break aa;
			}
			System.out.println("--------");
		}
		System.out.println("종료");
	}

}
