package shape;

public class ShapeEx1 {

	public static void main(String[] args) {
		// Shape 객체가 추상 클래스이기 때문에 객체를 만들려면 추상 메소드를 오버라이딩을 해야 만들어 진다.
		// => 객체가 분명해 졌다는 것을 의미 ==> 더이상 추상 클래스가 아님을 의미
		// 즉, 추상적이지가 않다.
		// 이 도형은 더이상 원, 삼각형, 사각형도 아우를 수 없다.
		// 이러한 논리적 모순이 생겨서 아래와 같이 쓰지 않는다.
		
//		Shape s = new Shape ("도형", " black", new Point(50, 50)) {
//			@Override
//			public void drawShape() {
//				System.out.println("그린다.");
//			}
//		};
		
		Triangle t1 = new Triangle("black", " 삼각형", new Point(50, 50), 10, 20);
		t1.drawShape();
		Rectangle r1 = new Rectangle("red", " 사각형", new Point(50, 50), 10, 20);
		r1.drawShape();
		Circle c1 = new Circle("blue", " 원", new Point(50, 50), 10);
		c1.drawShape();
		
		

	}

}
