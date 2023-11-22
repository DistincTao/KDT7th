package employees;

public class Full extends Employee{
	// 추가 맴버 변수 ㅇ벗음

	public Full(String empNo, String empName, int deptNo, int salary) {
		super(empNo, empName, deptNo, salary);
	}

	@Override
	public int setSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "정규직 [" + super.toString() + "]";
	}

	
	
}
