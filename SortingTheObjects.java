package Class_5;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private int empAge;
	private int EmpSalary;
	
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
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	Employee(int empId, String empName, int empAge, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.EmpSalary = empSalary;
	}
	@Override
	public String toString() {
		return "id is" + this.empId + "and name is" + this.empName + "and the age is" + this.empAge + "and Salary is" + this.EmpSalary;
	}
	
	@Override 
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}
	
	public static Comparator<Employee> ageComparator = new Comparator<>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmpAge() - o2.getEmpAge();
		}
	};
	
	public static Comparator<Employee> nameComparator = new Comparator<>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
	};
	
	public static Comparator<Employee> salaryComparator = new Comparator<>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmpSalary() - o2.getEmpSalary();
		}
	};
	
}

public class SortingTheObjects {
	public static void main(String[] args) {
	Employee[] empArr = new Employee[4];
	empArr[0] = new Employee(123, "A", 25, 5000);
	empArr[1] = new Employee(103, "B", 27, 6000);
	empArr[2] = new Employee(143, "C", 24, 7000);
	empArr[3] = new Employee(183, "D", 26, 8000);
	
	Arrays.sort(empArr);
	System.out.println("Sorted emp array is " + Arrays.toString(empArr));
	
	Arrays.sort(empArr, Employee.ageComparator);
	System.out.println("Sorted emp array - age is " + Arrays.toString(empArr));
	
	Arrays.sort(empArr, Employee.nameComparator);
	System.out.println("Sorted emp array - name is " + Arrays.toString(empArr));
	
	Arrays.sort(empArr, Employee.nameComparator);
	System.out.println("Sorted emp array - name is " + Arrays.toString(empArr));
	
	}
}






 


