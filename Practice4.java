package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Practice4 {
	
	public static void main(String[] args) {
		
		SortedSet<Book> s1 = new TreeSet<>();
		
		s1.add(new Book(100));
		s1.add(new Book(200));
		s1.add(new Book(-100));
		s1.add(new Book(300));
		
		for(Book e : s1) {
			System.out.println("Book Pages : "+e.getPages());
		}
	}
}
