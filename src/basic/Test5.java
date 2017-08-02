package basic;

import java.math.BigDecimal;

public class Test5 {
	public static void main(String[] args){
		//double 연산 오류 해결법
		//double a = 1.5;
		//double b = 1.2;
		double a = 2.0;
		double b = 1.1;
		
		System.out.println(a + b);
		System.out.println(a - b);
		
		System.out.println();
		BigDecimal d1 = new BigDecimal("2.0");
		BigDecimal d2 = new BigDecimal("1.1");
		System.out.println(d1.subtract(d2));
		
		System.out.println();
		BigDecimal no1 = new BigDecimal("123456789123456789123456789");
		BigDecimal no2 = new BigDecimal("213456789123456789123456780");
		System.out.println(no1.add(no2));
		System.out.println(no1.subtract(no2));
		System.out.println(no1.multiply(no2));
		System.out.println(no1.divide(no2, 2, BigDecimal.ROUND_UP));
		
	}
}
