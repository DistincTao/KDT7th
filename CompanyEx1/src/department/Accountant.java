package department;

public class Accountant {
	private String aName;
	
	Accountant(String name){
		this.aName = name;
	}
	
	public String getaName() {
		return this.aName;
	}

	public void calculatePay (Department d) {
		System.out.println(d.getName() + " 급여 목록");
		for (int i =0; i < d.getMember().length; i++) {
			if (d.getMember()[i] != null) {
				System.out.println((i + 1) + ". " + d.getMember()[i].toString());
			}
		}
		System.out.println("담당 회계사 : " + this.getaName());
	}
}
