package inheritance;

class ParentA {
	private int a = 100;
	
	public int getA() {
		return this.a;
	}
}

class ParentB {

}

class Child extends ParentA {
	
}

//class ETC extends ParentA, ParentB { // 두 부모 상속(다중 상속) 불가
//	
//}

public class InheritanceEx2 extends ParentA{

	public static void main(String[] args) {
		System.out.println(new ParentA().getA());
		System.out.println(new Child().getA());
		
		System.out.println(new InheritanceEx2().getA());
		
		// instanceof 연산자
		ParentA objParentA = new ParentA();
		Child objChild = new Child();
		
		if (objChild instanceof Child) {
			System.out.println("ojbChild는 Child의 객체입니다.");
		} else {
			System.out.println("ojbChild는 Child의 객체가 아닙니다.");
		}; 

		
		if (objChild instanceof ParentA) {
			System.out.println("ojbChild는 ParentA의 객체입니다.");
		} else {
			System.out.println("ojbChild는 ParentA의 객체가 아닙니다.");
		}; 
		
		
		if (objParentA instanceof ParentA) {
			System.out.println("objParentA는 ParentA의 객체입니다.");
		} else {
			System.out.println("objParentA는 ParentA의 객체가 아닙니다.");
		}; 
		
		
		if (objParentA instanceof Child) {
			System.out.println("objParentA는 Child의 객체입니다.");
		} else {
			System.out.println("objParentA는 Child의 객체가 아닙니다.");
		};
		
		
//		if (objChild instanceof ParentB) { // instanceof 사용 불가
//			// 오류 : Incompatible conditional operand types Child and ParentB
//			System.out.println("네");
//		} else {
//			System.out.println("아니오");
//		};
		
	}

}
