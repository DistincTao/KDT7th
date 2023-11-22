package electric;

public class Computer extends Electronic{

	public Computer(String brandName, String color, int price, String type) {
		super(brandName, color, price, type);

	}
	
	@Override
	public String toString() {
		return "사양이 " + super.toString() + "입니다.";
	}
}
