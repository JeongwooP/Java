package problem_solving;

import java.util.Arrays;

public class Exercise6_23 {
	public static int max(int[] ars){
		
		if(ars == null || ars.length == 0){
			return -999999;
		}
		
		int maximum = ars[0];
		
		for(int i = 0 ; i < ars.length; i++){
			
			if(maximum <= ars[i]){
				maximum = ars[i];
			}
		}
		
		
			return maximum;
		}
	public static void main(String[] args) {
		int [] data = {3 , 2, 9, 4, 7};
		System.out.println(Arrays.toString(data));
		System.out.println(max(data));
		System.out.println(max(null));
		System.out.println(max(new int[] {}));

	}

}
