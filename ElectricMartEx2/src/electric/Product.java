package electric;

public class Product {
	private int price;
	private int point; 

	// 생성자 
	protected Product (int price){
		this.price = price;
		this.point = (int)(price / 10.0);

	}

	public int getPrice() {
		return this.price;
	}

	public int getPoint() {
		return this.point;
	}
	

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "가격 : " + this.price + ", 포인트 : " + this.point ;
	}

}
