package basic2;

public class Test11ex {

	public static void main(String[] args) {
		//========================문제1) 1~100 사이의 숫자 중 3의 배수이지만 2의 배수가 아닌 수를 출력하고
		//그 합과 갯수를 출력
		//문제2) -1, 3, -5, 7, -9, 11, ~99 까지의 합 출력
		//문제3) 1~1000 사이의 소수와 그 갯수를 출력
		//	소수: 1보다 크며 1과 그 수 자체 이외의 다른 수로는 나누어 떨어지지 않는 수
		
		//#1
		int number = 1;
		int count=0, sum=0;
		while(number <= 100){
			if(number%3 == 0 && number%2 != 0){
					System.out.println(number);
					sum += number;
					count++;
			}
			
			
			number++;
		}
		System.out.println("개수: " + count);
		System.out.println("총합: " + sum);
		
		//#2
		int odd = -1;
		int sumup = 0;
		while(-99 <= odd && odd <= 99){
			sumup+= odd;
			
			if(odd<0){
				odd-=2;
			}
			else if(odd>0){
				odd+=2;
			}
			odd = -odd;
			
			
		}
		System.out.println("-1~99까지 총합: " + sumup);
		
		//#3 다시풀기 소수만 출력 (2, 3, 5, 7, 11...999까지)  boolean 이용
		int prime = 2;
		while(prime <= 1000){
			//소수면 count up
			if(prime == 2 || prime ==3){
				System.out.println(prime);
				prime++;
				continue;
			}
			
			if(prime % 2 !=0 && prime % 3 != 0 && prime % 5 != 0){
				System.out.println(prime);
				prime++;
				continue;
			}
			else{
				prime++;
				continue;
			}
		}

	}

}
