package Collections;

public class Employee implements Comparable<Employee> {
	
	private int employeeNumber;
	private String employeeName;
	
	public Employee(int employeeNumber, String employeeName) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	//for ascending order employee name sorting
	/*
	 * public int compareTo(Employee o) { // TODO Auto-generated method stub return
	 * (this.employeeName.compareTo(o.employeeName)); }
	 */
	
	//for descending order employee name sorting
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return (o.employeeName.compareTo(this.employeeName));
		}
	
}
