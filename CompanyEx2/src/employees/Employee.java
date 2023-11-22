package employees;

public abstract class Employee {
	private String empNo;
	private String empName;
	private int deptNo;
	protected int salary;
	
	Employee(String empNo, String empName, int deptNo, int salary){
		this.empNo = empNo;
		this.empName = empName;
		this.deptNo = deptNo;
		this.salary = salary;
	}

	public String getEmpNo() {
		return this.empNo;
	}

	public String getEmpName() {
		return this.empName;
	}

	public int getDeptNo() {
		return this.deptNo;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	// 정규직과 알바직 사원의 급여 지급 방법이 다르므로 abstract 클래스로 한다.
	public abstract int setSalary();

	@Override
	public String toString() {
		return "사번 : " + this.empNo + ", 이름 : " +  this.empName + ", 부서번호 : " + this.deptNo + ", 급여 : " + this.salary;
	}
	
	

}
