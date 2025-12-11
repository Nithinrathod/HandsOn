package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1dq1 {
	
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2,3,4,2,3);
		int dif = 0;
		int max_dif = 0;
		int indexNo = 0;
		for(int i=0;i<l1.size()-1;i++) {
			dif = l1.get(i)-l1.get(i+1);
			if(dif > max_dif) {
				max_dif = dif;
				indexNo = i;
			}
		}
		System.out.println("Max diff : "+max_dif+" Index No : "+indexNo);
		
	}
}
