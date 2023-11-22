package employees;

import java.util.ArrayList;

public class Department {
	private int deptNo;
	private String deptName;
	public ArrayList<Employee> empList;
	int i = 0;
	
	public Department(int deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.empList = new ArrayList<Employee>();
	}

	public int getDeptNo() {
		return this.deptNo;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public ArrayList<Employee> getEmpList() {
		return this.empList;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void addEmployee(Employee e) {
		this.empList.add(e);
	}
	
	public void outputEntireEmp() {
		for (Employee e : this.empList) {
			System.out.println(e.toString());
		}
	}
}
