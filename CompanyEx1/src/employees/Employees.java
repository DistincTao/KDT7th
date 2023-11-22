package employees;

public abstract class Employees {
	private String name;
	private String type;
	protected int hourlyRate = 10000;
	
	Employees(String name, String type){
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "직원 이름 : " + this.name + ", 업무 형태 : " + this.type;
	}
	
	public abstract void toDo();


	
}
