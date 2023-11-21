package shape;

public class Point {
	private int x;
	private int y;
	
	Point() {
		
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getPoint() {
		return this.x + ", " + this.y;
	}
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString () {
		return "원점 [x = " + x + ", y = " + y + "]";
	}
	
}
