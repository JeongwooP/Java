package pack;

public class CallBy2 {
	public void ex(int a, int b){	//인수로 기본형 변수를 사용
		int imsi = a;
		a = b;
		b = imsi;
		System.out.println("메소드 내의 a:" + a + ", b:" + b);
	}
	
	public void ex(CallBy1 data){	//인수로 참조형 변수를 사용
		int imsi = data.a;
		data.a = data.b;
		data.b = imsi;
		System.out.println("매소드 내의 a:" + data.a + ", b" + data.b);
	}
	
	public void ex(int[] ar){	//인수로 배열을 사용 
		int imsi = ar[0];
		ar[0] = ar[1];
		ar[1] = imsi;
	}
}
