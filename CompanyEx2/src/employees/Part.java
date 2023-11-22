package employees;

public class Part extends Employee{
	private int workTime;
	private int payPerHour;

	Part(String empNo, String empName, int deptNo, int workTime, int payPerHour) {
		super(empNo, empName, deptNo, workTime * payPerHour );
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}

	public int getWorkTime() {
		return this.workTime;
	}

	public int getPayPerHour() {
		return this.payPerHour;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}

	@Override
	public int setSalary() {
		super.salary = this.workTime * this.payPerHour;
		return super.salary;
	}

	@Override
	public String toString() {
		return "알바 [근무시간 : " + this.workTime + ", 시급 : " + this.payPerHour + ", " + super.toString() + "]";
	}
}
