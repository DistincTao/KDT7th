package shape;

public class Painter {
	private String name;
	
	// 생성자
	Painter() {
		
	}
	
	Painter(String name) {
		this.name = name;		
	}
	
	// getter, setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// method
//	public void draw(Triangle t) {
//	System.out.println(t.toString() + "인 사각형을 그립니다.");
//  }
//	
//	public void draw(Rectangle r) {
//		System.out.println(r.toString() + "인 사각형을 그립니다.");
//	}
//	
//	public void draw(Circle c) {
//		System.out.println(c.toString() + "인 원을 그립니다.");
//	}
	
	// 다형성
	// 다형성의 장점 2. 부모의 이름으로 모든 자식 객체를 매개변수로 받을 수 있다.
	public void draw(Shape s) {
//		System.out.println(s instanceof Circle);
//		System.out.println(s instanceof Triangle);
//		System.out.println(s instanceof Rectangle);
		System.out.println(s.toString() + "인" + s.getName() + "을 그립니다.(다형성)");
	// 다형성의 장점 1. 부모 이름으로 자식이 구현한 멤버를 사용할 수 있다.	
		s.drawShape(); 
	}
}
