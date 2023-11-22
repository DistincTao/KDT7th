package employees;

public class CompanyEx2 {
	public static void main(String[] args) {
		// 1)
		Employee 채치수 = new Part("2301", "채치수", 10, 10, 9620);
		Department 총무부 = new Department(10, "총무부");
		Employee 강백호 = new Full("2302", "강백호", 10, 2500000);
		
		총무부.addEmployee(채치수);
		총무부.addEmployee(강백호);
		// 2) 
		총무부.addEmployee(new Part("2303", "서태웅", 10, 8, 12000));
		총무부.outputEntireEmp();
		
		// 1)번과 2)번의 차이
		// 1)번은 변수에 객체를 담아 두었기 때문에 객체의 메소드를 활용 가능
		// 2)번은 변수가 없기 때문에 내용은 확인이 가능하지만 객체 내의 메소드 사용 불가
	}
}