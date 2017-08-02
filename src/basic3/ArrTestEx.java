package basic3;

public class ArrTestEx {

	public static void main(String[] kbs) {
		//프로그램 실행 시 1이상의 숫자를 받아 1 부터 그 수까지의 합?
		if(kbs.length == 0){
			System.out.println("값을 숫자로 입력하시오.");
			System.exit(0);
		}
		
		
		int sum = 0;
		int su = Integer.parseInt(kbs[0]);
		for(int i = 1; i <= su; i++){
			sum += i;
		}
		System.out.println("1~" + su + "까지의 합은 " + sum);
	}

}
