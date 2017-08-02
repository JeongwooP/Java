package basic2;

import java.util.Scanner;

public class Test8ex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오. ");
		int first = scan.nextInt();
		System.out.println("두번째 수를 입력하세요. ");
		int second = scan.nextInt();
		System.out.println("연산자(+ - * /)를 입력하세요. \n(조건: 0으로 나눌시 메시지를 출력 후 강제종료합니다.)");
		String operator = scan.next(); //<-->
		
		
		switch(operator){
			case "+":
				System.out.println(first + "+" + second + "=" + (first + second));
				break;
			case "-":
				System.out.println(first + "-" + second + "=" + (first - second));
				break;
			case "*":
				System.out.println(first + "*" + second + "=" + (first * second));
				break;
			case "/":
				if(second == 0){
					System.out.println("이렇게 계산할 수 없습니다. ");
					System.exit(0);
				}
				else{
				System.out.println(first + "/" + second + "=" + (first / second));
				}
				break;
		}
		

	}

}
