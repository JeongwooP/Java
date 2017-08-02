package basic2;

import java.util.Scanner;

public class Test7if {
	public static void main(String[] args){
		//조건판단문 if
		int num = 10;
		
		if(num >= 3){	//블럭화(그룹화) 
			System.out.println("크군요"); 
			System.out.println("참일 때");
		}
		System.out.println("다음 계속1");
		
		num = 2;
		if(num < 3){
			System.out.println("작군요");
			System.out.println("난 참");
		}else{
			System.out.println("작지 않아요");
		}
		System.out.println("다음 계속2");
		Scanner scanner = new Scanner(System.in);
		//System.out.print("점수는 ");
		//int jumsu = scanner.nextInt();
		//System.out.println(jumsu);
		int jumsu = 97;
		if(jumsu >= 70){
			if(jumsu >= 90){
				System.out.println("우수");
			}
		else{
			System.out.println("보통");
			}
		}else{
			System.out.println("저조");
				if(jumsu >= 60){
					System.out.println("노력하세요");
				}
			else{
				System.out.println("딴거하세요");
				}
			}
		jumsu = 100;
		String re = "결과는 ";
		if(jumsu >= 90){
			re += "수";	//re = "결과는 " + "수"
		}else if(jumsu >= 80){
			re += "우";
		}else if(jumsu >= 70){
			re += "미";
		}else if(jumsu >= 60){
			re += "양";
		}else{
			re += "가";
		}
		System.out.println(re);
		
	}
	
}
