package electric;

public class Electronic {
	private String brandName;
	private String color;
	private int price;
	private String type; 

	
	protected Electronic (String brandName, String color, int price, String type){
		this.brandName = brandName;
		this.color = color;
		this.price = price;
		this.type = type;

	}

	public int getPrice() {
		return this.price;
	}

	public String getColor() {
		return this.color;
	}
	
	public String getBrandName() {
		return this.brandName;
	}

	public String getType() {
		return this.type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "제조사 : " + this.brandName + ", 색상 : " + this.color + ", 가격 : " + this.price + ", 종류 : " + this.type ;
	}

	public void trunOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void trunOff() {
		System.out.println("전원을 끕니다.");
	}
}
