package pack;

public class Person2 {
	public String irum = "한국인";
	private int nai;
	private String juso;
	
	public Person2(){
		
	}
	
	//public void changeNai(int nai){
	
	public void setNai(int password, int nai){	//setter
		if(password == 123){	
		this.nai = nai;
		System.out.println("나이 바꾸기 성공");
		
		}else{
			System.out.println("당신은 나이를 바꿀 권한이 없습니다.");
		}
	}
	
	public int getNai(){	//getter
		return nai;
	}
	
	public void showData(){
		String irum = "우주인";
		System.out.println("이름:" + this.irum + ",나이:" + nai + ",주소:" + juso);
	}
	
	
}
