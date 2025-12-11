package Collections;

public class StringHandsOn {
	
	public static void main(String[] args) {
		String s[] = {"?2AA?", "?12?", "?ABC?", "?c1a?"};
		int sum = 0;
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length();j++) {
				char c = s[i].charAt(j);
				if(Character.isDigit(c)) {
					sum += (c - '0');
				}
			}
		}
		
		System.out.println("Sum : "+sum);
		
		String s1 = "helloworld";
		char c1 = s1.charAt(s1.length()-1);
		char c[] = s1.toCharArray();
		c[s1.length()-1] = c[0];
		c[0] = c1;
		s1 = String.valueOf(c);
		System.out.println("Modified String : "+s1);
		
		String[] s2 = {"Tn_Chennai", "Karnataka_Bangalore"};
		String s3 = "Karnataka";
		String s4 = "";
		for(int i=0;i<s2.length;i++) {
			if(s2[i].contains(s3)) {
				s4 = s2[i];
			}
		}
		String s5[] = s4.split("_");
		s4 = s5[1];
		System.out.println("Modified String : "+s4);
		
	}
}
