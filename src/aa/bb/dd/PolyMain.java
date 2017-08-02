package aa.bb.dd;

public class PolyMain {
	public static void main(String[] args) {
		PolyCar car1 = new PolyCar();
		PolyBus bus1 = new PolyBus();
		PolyTaxi taxi1 = new PolyTaxi();
		
		System.out.println();
		car1.dispData();
		System.out.println(car1.getSpeed());

		System.out.println("----------");
		bus1.dispData();
		bus1.show();
		System.out.println(bus1.getSpeed());
		
		System.out.println("----------");
		taxi1.dispData();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("^^^^^^^^^^");
		PolyCar car2 = new PolyBus();	//promotion
		car2.dispData();	//o
		//car2.show():	//error 규칙에 맞지 않았다. 자식고유의 메소드는 오버라이딩 되지 않았음으로 규칙에 어긋난다. 즉 호출 불가
		System.out.println(car2.getSpeed());	//o
		
		System.out.println();
		PolyCar car3 = taxi1;
		car3.dispData();
		System.out.println(car3.getSpeed());
		
		System.out.println("************");
		//PolyBus bus2 = new PolyCar();	//x
		PolyBus bus2 = (PolyBus)car2;	//casting
		bus2.dispData();
		System.out.println(bus2.getSpeed());
		bus2.show();
		
		System.out.println();
		//PolyTaxi taxi2 = new PolyCar();
		//PolyTaxi taxi2 = new PolyBus();
		PolyTaxi taxi3 = (PolyTaxi)car3;	//o
		//PolyTaxi taxi4 = (PolyTaxi)car1;	//ClassCastException
		
		System.out.println("\n다형성 처리");
		PolyCar mycar = car1;
		mycar.dispData();
		
		System.out.println();
		mycar = bus1;
		mycar.dispData();
		
		System.out.println();
		mycar = taxi1;
		mycar.dispData();
		
		System.out.println("-----------");
		PolyCar[] p = new PolyCar[3];	//배열 선언
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		for(int a = 0; a < p.length ; a++){
			p[a].dispData();
		}
		
		System.out.println();
		for(PolyCar car:p){
			car.dispData();
		}
		
		 
	}

}
