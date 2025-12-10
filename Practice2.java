package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of ArrayList1 : ");
		int size1 = sc.nextInt();
		List<Integer> l1 = new ArrayList<>();
		for(int i=0;i<size1;i++) {
			int val = sc.nextInt();
			l1.add(val);
		}
		System.out.print("Enter size of ArrayList2 : ");
		int size2 = sc.nextInt();
		List<Integer> l2 = new ArrayList<>();
		for(int i=0;i<size2;i++) {
			int val = sc.nextInt();
			l2.add(val);
		}		
		
		System.out.println("List1 : "+l1);
		System.out.println("List1 : "+l2);
		
		List<Integer> l3 = new ArrayList<>();
		int count = 0;
		for(int i=0;i<size1;i++) {
			int val = l1.get(i);
			boolean flag = l2.contains(val);
			if(flag == true) {
				l3.add(val);
				count++;
			}
		}
		
		System.out.println("Count of Common values : "+count);
		System.out.println("List of Common values : "+l3);
	}
}
