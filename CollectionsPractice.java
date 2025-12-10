package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsPractice {
	
	public static void main(String[] args) {
		// 1d collections - 4th solution - Prime index value average
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of ArrayList : ");
		int size = sc.nextInt();
		List<Integer> l1 = new ArrayList<>();
		for(int i=0;i<size;i++) {
			int val = sc.nextInt();
			l1.add(val);
		}
		
		System.out.println("List : "+l1);
		int sumOfIndexValues = 0;
		int flag = 1;
		int countOfIndex = 0;
		for(int i=2;i<size;i++) {
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					flag = 0;
				}
			}
			if(flag == 1) {
				sumOfIndexValues += l1.get(i);
				countOfIndex++;
			}else {
				flag = 1;
			}
		}
		
		System.out.println("Average of Prime Index Values : "+sumOfIndexValues/countOfIndex);
		
	}
}
