package copyinstance;

public class Car {
	String brandName;
	String modelName;
	int price;
	
	Car() {
		this("현대", "소나타", 40000000);
	}

	Car(String brandName, String modelName, int price) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
	}
	
	Car(Car c) {
		this.brandName = c.brandName;
		this.modelName = c.modelName;
		this.price = c.price;
	}

	@Override
	public String toString() {
		return "Car [brandName :" + brandName + ", modelName :" + modelName + ", price : " + price + ", hashCode : " + hashCode() + "]";
	}
	
	
	

}
