package oop_Basic;

public class OOPEx1_BasicConcept {

	public static void main(String[] args) {
		// car라는 객체 생성
		Car car1 = new Car();

		Car[] carArr = new Car[10];
		for (int i =0; i < 10; i++) {
			carArr[i] = new Car();
			System.out.println(i + " : " + carArr[i].hashCode());
		}
		
		System.out.println("car1의 모델명 : " + car1.modelName + ", 가격 : " + car1.price +", 색상 : " + car1.color);

		
		Car car2 = new Car();
		car2.color = "흰색";
		car2.modelName = "모닝";
		car2.brandName = "기아";
		car2.price = 23000000;
		System.out.println("car2의 모델명 : " + car2.modelName + ", 가격 : " + car2.price +", 색상 : " + car2.color);
		
		// Car 객체의 맴버 메소드 displayCar() 호출
		car1.displayCar();
		car2.displayCar();
		
	}

}
