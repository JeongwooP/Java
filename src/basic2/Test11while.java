package basic2;

public class Test11while {

	public static void main(String[] args) {
		//반복문 while
		int w = 1;
		
		while(w <= 5){
			System.out.print("w:" + w + " ");
			w += 1; //반복문 탈출용 문장 반드시 필요
		}
		
		System.out.println();
		w = 0;
		while(true){
			w++;
			if(w == 5) break;
			if(w == 3) continue;
			System.out.println("w:" + w);
		}
		
		System.out.println();
		w = 1;
		do{
			System.out.println("do while의 w:" + w);
			w++;
		}while(w <= 5);
		
		System.out.println("종료");
		
		
	}

}
