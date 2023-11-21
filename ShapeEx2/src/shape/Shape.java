package shape;

public abstract class Shape {
//public class Shape {
	private String color;
	private String name;
	private Point originPoint;
		
	public Shape() {
	}
		
	public Shape (String color, String name, Point originPoint) {
		this.color = color;
		this.name = name;
		this.originPoint = originPoint;
	}
	
//	 그리는 기능을 메소드로 구현
	public abstract void drawShape(); // abstract 추상적인 메소드 => 추상 메소드는 추상 클래스에서만 생성 가능
	
//	public void drawShape() {
//		
//	};

//	public void drawShape() {
//		System.out.println(toString());
//	};

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}
	
	public Point getOriginPoint() {
		return originPoint;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOriginPoint(Point originPoint) {
		this.originPoint = originPoint;
	}

	@Override
	public String toString() {
		return "Shape [색 = " + color + ", 도형 = " + name + ", 원점 = " + originPoint + "]";
	}
		
}
