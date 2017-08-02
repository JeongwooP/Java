package basic2;

import java.util.Scanner;

public class Test8switch {

	public static void main(String[] args) {
		// 조건판단문 switch
		int nai = 25;
		nai = nai / 10 * 10;
		//System.out.println(nai);
		switch(nai){
		case 20:
			System.out.println("이십대");
			System.out.println("좋은 나이");
			break;
		case 30:
			System.out.println("삼십대");
			break;
		default:
			System.out.println("기타");
			break;
		}
		
		System.out.println();
		//double d = Math.random();
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("d : " + time);
		switch(time){
		case 8:
			System.out.println("출근하자");
			break;
		//case 
		}
		
		System.out.println();
		//특정 년월의 날 수 출력 (윤년 체크)
		int year, month, nalsu = 28;
		Scanner sc = new Scanner(System.in); //<--
		System.out.print("년 입력:");
		year = sc.nextInt();
		System.out.print("월 입력:");
		month = sc.nextInt();
		
		if(month < 1 || month > 12){
			System.out.println("월은 1부터 12사이만 허용!");
			System.exit(0);
		}
		switch (month) {
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12:
				nalsu = 31;
				break;
			case 4: case 6: case 9: case 11:
				nalsu = 30;
				break;
			case 2:
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
					nalsu = 29;
				}else{
					nalsu = 28;
				}
				break;
		}
		
		System.out.println(year + "년" + month + "월은 날수 " + nalsu);
		
		System.out.println();
		
		String jik = "과장";
		switch (jik) {
		case "대리":
			System.out.println("난 대리");
			break;
		case "과장":
			System.out.println("난 과장");
		default:
			System.out.println("난 직원");
			break;
		}
	
		
	}

}
