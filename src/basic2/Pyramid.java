package basic2;

public class Pyramid {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			
			for(int l = 5; l > 6-i ; l--)
			{
				System.out.print(" ");
			}
			for(int j = 5; j >= i; j--){
				//if
				System.out.print("*");
			}
			for(int k = 4; k >= i; k--){
				System.out.print("*");
				}
			
			System.out.println();
			}
	
		}
}
