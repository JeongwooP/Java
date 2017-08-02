package basic2;

public class Test9For {

	public static void main(String[] args) {
		// 반복문 for
		System.out.println("반복처리 연습");
		int a;
		int myKorEng; //카멜표기법
		for(a = 1; a <= 5; a ++){ 	//a += 1이랑 a = a+1이랑 a++랑 증감식에서는 같다.
		//for(int a = 1; a <= 5; a = a + 1){	
			System.out.println(a);
		}
		System.out.println("수행 후 a:" + a);
		
		System.out.println();
		System.out.println("반복처리학습");
		
		for(a = 1; a <=5 ; a++){
			System.out.println(a);
		}
		System.out.println("수행 후 a:" + a);
		
		System.out.println();
		int sum = 0;	//누적 변수는 초기화 하자.
		for(a = 1; a <= 10; a++){
			//System.out.println(a)
			sum += a;
		}
		System.out.println("합은 " + sum);
		
		System.out.println();
		for(int i = 65; i <= 90; i++){
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		for(int i = 'A'; i <= 'Z'; i++){
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(int i = 10; i >= 1 ; i-=2){
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(int ytn = 0, tv = 5; ytn <= 5 && tv <= 10; ytn++, tv++){
			System.out.println(ytn + " " + tv);
		}
		
		System.out.println();
		int aa = 1;
		for(; aa <= 5; aa++){
			System.out.print(aa + " ");
		}
		
		System.out.println();
		for(int count = 1; count < 10; count++){
			System.out.println("3 * " + count + " = " + (3 * count));
		}
		
		//문1 : 키보드에서 2 ~ 9 사이의 수를 받아 해당 숫자로 구구단 출력
		
		//문2 : 1 ~ 100 사이의 숫자 중 3의 배수이면서 5의 배수인 숫자의 갯수와 합 출력
		
	}

}
