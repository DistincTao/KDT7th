package oop_Basic;

public class Car {
	// 맴버 변수
	String brandName = "현대";
	String modelName = "그랜저";
	int price = 45000000;
	String color = "검정색";

	// 맴버 메소드
	public void displayCar() {
		System.out.println("브랜드명 : " + brandName);
		System.out.println("모델명 : " + modelName);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color);
	}
	
	

}
