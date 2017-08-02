package aa.bb.ff;

public class R_Tom implements Resume{
	private String irum, phone, juso;
	
	public R_Tom() {
		// TODO Auto-generated constructor stub
	}
	
	public void setIrum(String irum){
		this.irum = irum;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setJuso(String juso){
		this.juso = juso;
	}
	
	@Override
	public void print() {
		//Resume.SIZE = "b5"; //수정 불가
		System.out.println("용지크기:" + Resume.SIZE);
		System.out.println("이름: " + irum + ", 전화: " + phone + ", 주소: " + juso);
		Resume.changeData();//참고 java 1.8 이후에 나온 것
	}
}
