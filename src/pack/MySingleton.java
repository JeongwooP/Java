package pack;

public class MySingleton {
	int kor = 90;
	
	private static MySingleton my = new MySingleton();
	
	public static MySingleton getInstance(){
		return my;
	}
}
