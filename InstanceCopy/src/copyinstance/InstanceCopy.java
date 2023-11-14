package copyinstance;

public class InstanceCopy {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.toString());
		
		Car car2 = new Car("기아", "모하비", 50000000);
		System.out.println(car2.toString());
		
		Car car3 = new Car(car2);
		System.out.println(car3.toString());
		
		car2.modelName = "k5";
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		
	}

}
