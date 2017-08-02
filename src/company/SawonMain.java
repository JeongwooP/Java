package company;

public class SawonMain {
	public static void main(String[] args) {
		Temporary tem = new Temporary("박치기", 21, 20, 90000);
		tem.print();

		Regular reg = new Regular("홍길동", 23, 1234000);
		reg.print();

		SalesMan sal = new SalesMan("한송이", 25, 2345000, 3000, 0.25);
		sal.print();

		Manager man = new Manager("한국인", 27, 2555000);
		man.print();

	}
}
