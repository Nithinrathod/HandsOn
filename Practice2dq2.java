package Collections;

import java.util.HashMap;

public class Practice2dq2 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> m1 = new HashMap<>();
		m1.put(12, 90);
		m1.put(35, 90);
		m1.put(33, 90);
		m1.put(56, 88);
		
		int sum = 0;
		int count = 0;
		for(Integer key : m1.keySet()) {
			if(key%2 != 0) {
				sum += m1.get(key);
				count++;
			}
		}
		
		System.out.println("Average of Odd Reg Numbers : "+sum/count);
	}
}
