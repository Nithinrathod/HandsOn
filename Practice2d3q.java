package Collections;

import java.util.HashMap;

public class Practice2d3q {
	
	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<>();
		
		m1.put(12, "hari");
		m1.put(13, "krish");
		m1.put(18, "mani");
		
		int max_key = 0;
		String res = "";
		for(Integer key : m1.keySet()) {
			max_key = Math.max(key, max_key);
			res = m1.get(max_key);
		}
		System.out.println("Max Key Value : "+res);
	}
}
