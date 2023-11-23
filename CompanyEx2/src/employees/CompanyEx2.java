package employees;

public class CompanyEx2 {
	public static void main(String[] args) {
		
		// 1)번과 2)번의 차이
		
		// 1)
		// 메소드, 속성 호출 방법 : 선언한 변수를 통해 호출 가능
		// 해당 객체에 직접 변수를 통해 담아 두었기 때문에, 다른 클래스에서 사용 중 그 클래스가 삭제 되더라도 본래 클래스의 데이터에는 영향이 없다. (본 클래스가 직접적으로 삭제가 되어야 데이터 소실)
		Employee 채치수 = new Part("2301", "채치수", 10, 10, 9620);
		Department 총무부 = new Department(10, "총무부");
		Employee 강백호 = new Full("2302", "강백호", 10, 2500000);
		
		총무부.addEmployee(채치수);
		총무부.addEmployee(강백호);
//		총무부 = null;
		System.out.println(채치수.toString());
		System.out.println(강백호.toString());
		
		// 2)
		// 메소드, 속성 호출 방법 : 객체 배열에 들어있는 경우 배열의 인덱스 번호를 통해서 호출 가능
		// 해당 객체가 변수를 통해 직접 선언 되지 않고 (본 객체 클래스에 저장 되지 않음), 호출은 다른 클래스의 메소드/배열 내에서 생성 되었기 때문에 호출한 클래스에 문제 발생 시 본 데이터도 함께 영향을 받음 (삭제 시 데이터 소실)
		Department it = new Department(20, "IT");

		it.addEmployee(new Part("2303", "서태웅", 20, 8, 12000));
		it.outputEntireEmp();
		it = null;
	
	}
}