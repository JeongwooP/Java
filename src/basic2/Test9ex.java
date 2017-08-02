package basic2;

import java.util.Scanner;

public class Test9ex {

	public static void main(String[] args) {
		// #1
		Scanner sc = new Scanner(System.in);
		System.out.println("2 ~ 9 사이의 수를 입력하시오. ");
		int number = sc.nextInt();
		
		for(int a = 1; a <= 9; a++){
			System.out.println(number + " * " + a + " = " + a*number);
		}
		
		//#2
		System.out.println("1 ~ 100 사이의 숫자 중 3의 배수이면서 5의 배수인 숫자의 갯수와 합");
		
		int sum = 0, count = 0;
		for(int b = 1; b <= 100; b++){
			if(b % 3 == 0 && b % 5 == 0){
				System.out.println(b);
				sum+= b;
				count++;
			}
		}
		System.out.print("그 숫자들의 개수: " + count + "합: "
				+ "" + sum);
	}

}
