package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Practice3 {
	
	public static void main(String[] args) {
		
		SortedSet<Employee> s1 = new TreeSet<>();
		
		s1.add(new Employee(1, "Nithin"));
		s1.add(new Employee(2, "Shekar"));
		s1.add(new Employee(3, "Pranay"));
		
		for(Employee e : s1) {
			System.out.println("Employee Number : "+e.getEmployeeNumber()+" Employee Name: "+e.getEmployeeName());
		}
	}
}
