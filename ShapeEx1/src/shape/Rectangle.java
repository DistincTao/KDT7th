package shape;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle (String color, String name, Point originPoint, int width, int height) {
		super(color, name, originPoint);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void drawShape() {
		System.out.println(toString() + "인 " + super.getName() + "이 그려집니다.");
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	public void setLon(int width) {
		this.width = width;
	}

	public void setLat(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Square [가로 = " + width + ", 세로 = " + height + ", 색 = " + super.getColor() + ", " + super.getOriginPoint() + "]";
	}	
}