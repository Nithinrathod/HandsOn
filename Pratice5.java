package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pratice5 {
	//h1 - Employee id and designation
	//h2 - id and salary
	//h3 - designation - "manager" and salary += 5000
	
	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<>();
		Map<Integer, Integer> m2 = new HashMap<>();
		Map<Integer, Integer> m3 = new HashMap<>();
		
		m1.put(1, "analyst");
		m1.put(2, "manager");
		
		m2.put(1, 2000);
		m2.put(2, 5000);
		
		for(Map.Entry<Integer, String> entry : m1.entrySet()) {
			System.out.println("key : "+entry.getKey()+" Value : "+entry.getValue());
			if(entry.getValue() == "manager") {
				int val = entry.getKey();
				int salary = m2.get(val);
				salary += 5000;
				m3.put(val, salary);
			}
		}
		
		for(Entry<Integer, Integer> entry : m3.entrySet()) {
			System.out.println("key : "+entry.getKey()+" Value : "+entry.getValue());
		}
	}
}
