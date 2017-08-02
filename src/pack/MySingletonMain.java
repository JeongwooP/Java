package pack;

import java.util.Calendar;

public class MySingletonMain {
	public static void main(String[] args) {
		MySingleton singleton1 = new MySingleton();
		System.out.println(singleton1.kor);
		
		MySingleton singleton2 = new MySingleton();
		System.out.println(singleton2.kor);
	
		System.out.println(singleton1 + " " + singleton2);
		
		System.out.println();
		MySingleton s1 = MySingleton.getInstance();
		System.out.println(s1.kor);
		
		MySingleton s2 = MySingleton.getInstance();
		System.out.println(s2.kor);
		
		System.out.println(s1 + " " + s2);
	
		System.out.println("\n날짜 출력");
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DATE);
		System.out.println("년도는 " + y + "년 " + m + "월 " + d + "일");
		
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.HOUR_OF_DAY);
		int s = cal.get(Calendar.SECOND);
		System.out.println(h + "시" + mi + "분" + s + "초");
		
	}

}
