package shape;

// 부모 Shape 클래스에 기본 생성자를 만들지 않은 상태에서 Triangle 클래스를 만들려고 할 때
// (부모 객체를 만들지 못해서) 에러 발생 => Implicit supper constructor Shape() is undefinded for default constructor. Must define an exlpicit constructor
// 해결 방법
// 1. 부모 객체에 기본 생성자 만들어 준다.
// 2. 부모 객체가 가지고 있는 오버로딩된 생성자를 이용해서 부모 객체를 만들어 준다.
//		public Triangle (String color, String name, Point originPoint) {
//			super(color, name, originPoint);
//		}



public class Triangle extends Shape {
	private int height;
	private int base;
	
	public Triangle (String color, String name, Point originPoint, int height, int base) {
		super(color, name, originPoint);
		this.height = height;
		this.base = base;
	}

	@Override
	public void drawShape() {
		System.out.println(toString() + "인 " + super.getName() + "이 그려집니다.");
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getBase() {
		return base;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Triangle [높이 = " + this.height + ", 밑변 = " + this.base + ", 색 = " + super.getColor() + ", " + super.getOriginPoint() + "]";
	}
}
