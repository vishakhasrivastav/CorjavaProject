package collection;
//alt+shift+s
/*
 * generate constructor superclass
 * generate constructor field
 * generate getter setter
 * generate toString
 */
public class Employee implements Comparable<Employee> {
	
	private Integer empId;
	private String empName;
	private String designation;
	private Double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, String designation, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}
	
	

}
