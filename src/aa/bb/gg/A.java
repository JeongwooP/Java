package aa.bb.gg;

public class A {
	int field1;
	
	public A(){
		System.out.println("A 객체 생성");
	}
	
	void method1(){
		System.out.println("method1 수행: " + field1);
	}
	
	class B{	//인스턴스 멤버 클래스 (중첩, 내부 클래스)
		int field2;
		
		public B() {
			System.out.println("B 오브젝트 생성");
		}
		
		void method2(){
			System.out.println("method2 수행: " + field2);
		}
	}
	
	static class C{ //정적 멤버 클래스
		int field3;
		
		public C() {
			System.out.println("C 오브젝트 생성");
		}
		
		void method3(){
			System.out.println("method2 수행: " + field3);
		}
	}
	
	void a_method4(){
		System.out.println("a_method4가 진행");
		class D{	//local class
			int field4;
			
			public D(){
				System.out.println("D 인스턴스 생성");
			}
			void method5(){
				System.out.println("method2 수행: " + field4);
			}
		}
		
		D d = new D();
		d.field4 = 4;
		d.method5();
	
}
	
	//===========================================
	public static void main(String[] args) {
		A a = new A();
		a.field1 = 1;
		a.method1();
		
		System.out.println("\n인스턴스 멤버 클래스------");
		//B b = new B();	//No enclosing instance of type A is accessible
		A.B b = a.new B();
		b.field2 = 2;
		b.method2();
		
		System.out.println("\n정적 멤버 클래스------");
		A.C c = new A.C();
		c.field3 = 3;
		c.method3();
		C c2 = new C();
		c.field3 = 3;
		c.method3();
		
		System.out.println("\n지역 멤버 클래스------");
		a.a_method4();
	}
}
