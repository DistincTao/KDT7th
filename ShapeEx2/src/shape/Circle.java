package shape;

public class Circle extends Shape {
	private int radius;

	public Circle (String color, String name, Point originPoint, int radious) {
		super(color, name, originPoint);
		this.radius = radious;
	}
	
	@Override
	public void drawShape() {
		System.out.println(toString() + "인" + super.getName() + "이 그려집니다.");
	}
	
	public int getRadious() {
		return radius;
	}

	public void setRadious(int radious) {
		this.radius = radious;
	}

	@Override
	public String toString() {
		return "Circle [반지름 = " + radius + ", 색 = " + super.getColor() + ", " + super.getOriginPoint() + "]";
	}
}

