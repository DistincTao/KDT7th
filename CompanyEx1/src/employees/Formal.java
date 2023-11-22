package employees;

public class Formal extends Employees{
	private int basePay;
	private int overTime;
	private int extraPay;
	private int totalPay;

	public Formal(String name, String type, int basePay, int overTime) {
		super(name, type);
		this.basePay = basePay;
		this.overTime = overTime;
		this.extraPay = overTime * super.getHourlyRate();
		this.totalPay = this.basePay + this.extraPay;
	}


	public int getBasePay() {
		return this.basePay;
	}

	public int getOverTime() {
		return this.overTime;
	}

	public int getExtraPay() {
		return this.extraPay;
	}

	public int getTotalPay() {
		return this.totalPay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}

	@Override
	public void toDo() {
		System.out.println("칼퇴 준비!!!");
	}
	
	public int toOverTime(int overTime) {
		this.overTime = overTime;
		System.out.println("오늘 " + this.overTime + "시간 추가 근무를 했습니다.");
		return extraPay;
	}

	@Override
	public String toString() {
		return "직원 : " + this.getName() + "\n 근무 형태 : " + this.getType() 
				+ "\n 기본급 : " + this.basePay + "\n 추가 근무 시간 : " + this.overTime 
				+ "시간 \n 추가 수당 : " + this.extraPay + "원 \n 이번달 급여: " + this.totalPay + "원";
	}

}
