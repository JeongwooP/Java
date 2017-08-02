package basic2;

import java.util.Scanner;

public class Test7ex {

	public static void main(String[] args) {	//홍길동 23
		// 문제1: 프로그램 수행 시 이름과 나이를 입력받아
		// 홍길동님은 20대
		
		// 문제2: 키보드로 이름과 국어, 영어 점수를 입력받아 아래처럼 출력
		// 이름:박정우 총점:*** 평균:**
		if(args.length <= 1){
			System.out.println("값이 없어요");
			System.exit(0);
		}
		int age = Integer.parseInt(args[1]);
		int line = age / 10;
		System.out.println(args[0] + "님은 " + line * 10 + "대");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = sc.next();
		System.out.println("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력:");
		int eng = sc.nextInt();
		
		int sum = (kor) + (eng);
		
		System.out.println(" 이름: " + name + "\n" + " 총점: " + sum +"\n"+ " 평균: " + sum/2);
		
	}

}
