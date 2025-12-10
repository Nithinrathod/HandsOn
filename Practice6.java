package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice6 {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> m1 = new HashMap<>();
		
		m1.put(1, 4);
		m1.put(2, 7);
		m1.put(3, 8);
		m1.put(4, 6);
		
		int sumOfOddIndexValues = 0;
		int count = 0;
		for(Entry<Integer, Integer> entry : m1.entrySet()) {
			if(entry.getKey()%2 != 0) {
				sumOfOddIndexValues += entry.getValue();
				count++;
			}
		}
		
		System.out.println("Average Of Odd Index Values : "+ sumOfOddIndexValues/count);
	}
}
