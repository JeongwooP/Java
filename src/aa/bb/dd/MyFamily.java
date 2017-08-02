package aa.bb.dd;

public class MyFamily {

	public static void main(String[] args) {
		GrandFa grandFa = new GrandFa();
		System.out.println("가보:" + grandFa.gabo);
		System.out.println("가훈:" + grandFa.gahun);
		System.out.println(grandFa.say());
		grandFa.eat();
		System.out.println("할아버지 나이: " + grandFa.getNai());
		
		System.out.println();
		Father father = new Father();
		System.out.println("가보:" + father.gabo);
		System.out.println("가훈:" + father.gahun);
		System.out.println(father.say());
		father.eat();
		System.out.println("아버지 나이: " + father.getNai());
		System.out.println("집: " + father.getHouse());
		
		father.showData(); //this 와 super
		
		System.out.println();
		Me me = new Me();
		System.out.println("가보:" + me.gabo);
		System.out.println("가훈:" + me.gahun);
		System.out.println(me.say());
		me.eat();
		System.out.println("아버지 나이: " + me.getNai());
		System.out.println("집: " + me.getHouse());
		
	}

}
