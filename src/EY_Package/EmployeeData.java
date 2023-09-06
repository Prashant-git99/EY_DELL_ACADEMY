package EY_Package;

public class EmployeeData {
	//properties/attributes/fields
	int empId;
	String empName;
	double empSalary;
	String empDesignation;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public static void main(String[] args)
	{
		EmployeeData emp=new EmployeeData();
		emp.setEmpId(123);
		emp.setEmpName("Prashant");
		emp.setEmpSalary(5000);
		emp.setEmpDesignation("Software Engineer");
		
		System.out.println("Id of the emp is "+emp.getEmpId());
		System.out.println("Name of the emp is "+emp.getEmpName());
		System.out.println("Salary of the emp is "+emp.getEmpSalary());
		System.out.println("Designation of the emp is "+emp.getEmpDesignation());	
	}
	
	

}
