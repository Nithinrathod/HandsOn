package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1dq3 {
	
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(12, 1, 32, 3);
		List<Integer> l2 = Arrays.asList(0, 12, 2, 23);
		
		List<Integer> l3 = new ArrayList<>();
		
		for(int i=0;i<Math.max(l1.size(), l2.size());i++) {
			if(i < l1.size() && i%2!=0) {
				l3.add(l1.get(i));
			}
			if(i < l2.size() && i%2==0) {
				l3.add(l2.get(i));
			}
		}
		
		System.out.println("Modified List : "+l3);
	}
}
