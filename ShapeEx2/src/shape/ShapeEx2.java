package shape;

public class ShapeEx2 {

	public static void main(String[] args) {
	
		Triangle t = new Triangle("black", " 삼각형", new Point(50, 50), 10, 20);
		t.drawShape();
		Rectangle r = new Rectangle("red", " 사각형", new Point(50, 50), 10, 20);
		r.drawShape();
		Circle c = new Circle("blue", " 원", new Point(50, 50), 10);
		c.drawShape();
		
		System.out.println("-----------------------------------------------------------------------------------");
		Painter 피카소 = new Painter("피카소");
		피카소.draw(t);
		피카소.draw(r);
		피카소.draw(c);
	}
}