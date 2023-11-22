package employees;

public class Part extends Employees{
	private int dailyTime;
	private int workedDays;
	private int totalPay = (this.dailyTime * this.workedDays * super.getHourlyRate());


	public Part(String name, String type, int dailyTime, int workedDays ) {
		super(name, type);
		this.dailyTime = dailyTime;
		this.workedDays = workedDays;
		this.totalPay = (this.dailyTime * this.workedDays * super.getHourlyRate());

		// TODO Auto-generated constructor stub
	}

	public int getDailyTime() {
		return this.dailyTime;
	}

	public int getTotalPay() {
		return this.totalPay;
	}

	public int getWorkedDays() {
		return this.workedDays;
	}

	public void setDailyTime(int dailyTime) {
		this.dailyTime = dailyTime;
	}

	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}

	public void setWorkedDays(int workedDays) {
		this.workedDays = workedDays;
	}

	@Override
	public void toDo() {
		System.out.println("오늘도 즐거운 알바!!!");
	}
	
	public void toOverTime() {
		System.out.println("오늘 알바가 그만두었습니다.");
	}

	@Override
	public String toString() {
		return "직원 : " + this.getName() + "\n 근무 형태 : " + this.getType() 
				+ "\n 일한 시간 : " + (this.dailyTime * this.workedDays)
				+ "시간 \n 이번달 급여: " + this.totalPay + "원";
	}
}
