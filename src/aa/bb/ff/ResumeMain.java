package aa.bb.ff;

public class ResumeMain {
	public static void main(String[] args) {
		System.out.println("톰 이력서 작성 후 환인 --- ");
		R_Tom tom = new R_Tom();
		tom.setIrum("톰");
		tom.setPhone("111-1111");
		tom.setJuso("강남구 테헤란로 123");
		tom.print();
		
		System.out.println("제임스 이력서 작성 후 확인---");
		R_James james = new R_James();
		james.setIrum("제임스");
		james.setPhone("222-2222");
		james.setSkill("웹 전문가:");
		james.print();
		
		System.out.println("\n인사 담당자가 이력서 수거 후 확인 ---");
		Resume[] resBox = new Resume[2];
		resBox[0] = tom;
		resBox[1] = james;
		
		for(Resume r: resBox){
			r.print();
			System.out.println();
		}
	}
}
