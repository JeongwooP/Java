package basic3;

public class ArrTest {
	public static void main(String[] args) {
		//기억장소 선언 : 단순변수, 배열, 레코드형
		//배열  : 성격과 크기가 일치하는 복수개의 기억장소를 대표명 하나를 주고 선언
		//	코드의 길이를 줄임. 반복처리
		int a;
		//int[] ar;	//int ar[];
		//ar = new int[5];	//기억장소 확보
		int [] ar = new int[5];
		System.out.println("크기는 "+ ar.length);
		ar[0] = 10; ar[1] = 20; ar[4]=ar[0]=ar[1];
		System.out.println("ar[4]:" + ar[4]);
		//System.out.println(ar[5]);
		
		int m = 4, n = 4;
		System.out.println(ar[3+1] + " " + ar[4] + " " + ar[m] + " " + ar[n]);
		
		System.out.println();
		int [] ar2 = {1,2,3,4,5};	//선언과 동시에 초기값 부여
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[2]);
		System.out.println(ar2[3]);
		System.out.println(ar2[4]);
		System.out.println(ar2[0] + ar2[1] + ar2[2] + ar2[3] + ar2[4]);
		
		System.out.println();
		int hap = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println(ar2[i]);
			hap += ar2[i];
		}
		System.out.println("합은 " + hap);
		
		//향상된 for
		for(int kk:ar2){
			System.out.println(kk);
		}
		
		System.out.println();
		String[] city = {"서울", "대전", "광주", "부산", "대구"};
		for(String c:city){
			System.out.println("도시명 : " + c);
		}
		
		System.out.println();
		int[] ar3 = new int[5];
		for(int i = 0; i < ar3.length; i++){
			ar3[i] = i;
		}
		for(int i = 0; i < ar3.length; i++){
			System.out.println(ar3[i] + " ");
		}
		
		System.out.println("\n다차원 배열---");
		//int a1, a2, a3...a12;     //단순 변수     
		//int aa[] = new int[12];   //1차원 배열
		int su[][] = new int[3][4];	//2차원 배열
		System.out.println(su.length + " " + su[0].length); //행의 개수, 열의 개수
		su[0][0] = 10;//0행0열에 10을 기억
		System.out.println(su[0][0]);
		
		System.out.println();	//2차원 배열에 값 입력
		int num = 10;
		for(int i= 0; i <su.length; i++){
			for(int j = 0; j < su[i].length; j++){
				su[i][j] = num++;
			}
		}
		//System.out.println(su[0][0]);
		for(int i= 0; i <su.length; i++){
			for(int j = 0; j < su[i].length; j++){
				System.out.print(su[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n가변 배열");
		int[][] scores = new int[2][];
		scores[0] = new int[2];
		scores[1] = new int[3];
		System.out.println(scores.length + " " + 
				scores[0].length + " " + scores[1].length);
		
		System.out.println();
		int jum1[][] = {{90, 96, 77}, {88, 85, 89}};	//2차원 고정
		int jum2[][] = {{90, 91}, {100, 97, 89}};		//2차원 가변
		for (int i = 0; i < jum2.length; i++) {
			for (int j = 0; j < jum2[i].length; j++) {
				System.out.print(jum2[i][j] + " ");	
			}
			System.out.println();
		}
	}

}
