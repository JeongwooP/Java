package aa.bb.ff;

public class R_James implements Resume{
	private String irum, phone, skill;
	
	public R_James(){
		
	}
	
	@Override
	public void setIrum(String irum) {
		String imsi = irum;
		this.irum = imsi;
	}
	
	@Override
	public void setPhone(String phone) {
		this.phone = phone;		
	}
	
	public void setSkill(String skill){
		this.skill = skill;
	}
	
	@Override
	public void print() {
		System.out.println("용지크기:" + Resume.SIZE);
		System.out.println("이름: " + irum + ", 전화: " + phone + ", 기술: " + skill);
	}
}
