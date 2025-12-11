package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1dq2 {
	
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 100, 200, 600);
		List<Integer> l2 = Arrays.asList(3, 4, 5, 6);
		List<Integer> l3 = new ArrayList<>();
		for(int i=0;i<l1.size();i++) {
			if(l2.contains(l1.get(i))) {
				l3.add(l1.get(i));
			}
		}
		
		System.out.println("List : "+l3);
		System.out.println("Size of Common Elements : "+l3.size());
	}
}
