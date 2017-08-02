package problem_solving;

public class Exercise6_24 {
	public static int abs(int value){
		int absolute = value<0? -value : value;
		return absolute;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값: " + abs(value));

	}

}
