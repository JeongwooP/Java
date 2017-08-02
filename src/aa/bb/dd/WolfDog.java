package aa.bb.dd;

public class WolfDog extends Dog{
	private String where = "산";
	
	public WolfDog(String name) {
		super(name);
	}
	
	public WolfDog(String name, String where){
		super(name);
		this.where = where;
	}
	
	public void show(){
		System.out.println("거주:" + where + "속");
	}
	
	@Override
	public void print() {
		System.out.println(getName() + "은(는)" + where + "에 산다.");
	}

	public void display(){
		print();
		this.print();
		super.print();
	}
}
