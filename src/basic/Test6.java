package basic;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args){
		//프로그램 진행 도충에 값 받기
		if(args.length == 0){
			System.out.println("외부에서 값 얻기 실패");
			System.exit(0);	//응용프로그램의 강제 종료
		}
		System.out.println(args.length);
		System.out.println(args[0] + " " + args[1]);
		
		//키보드로 자료 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 입력:");
		String product = sc.next();
		System.out.print("가격 입력:");
		int price = sc.nextInt();
		System.out.print("수량 입력:");
		int count = sc.nextInt();
		
		System.out.println("상품명은 " + product + ", 가격은 " + price);
		System.out.println("총액은 " + (price * count));
		System.out.println("처리 완료");
	
	}
}
