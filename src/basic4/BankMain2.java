package basic4;

//import pack.Bank;
//import pack.Car;
//import pack.Animal;
import pack.*;

public class BankMain2 {

	public static void main(String[] args) {
		// pack.Bank james = new pack.Bank();
		Bank james = new Bank();
		//Animal cat = new Animal();
		//Car sonata = new Car();
		//System.out.println(james.imsi);	//package내에서만 유효
		System.out.println(james.imsi2);	//public이니까
	}

}
