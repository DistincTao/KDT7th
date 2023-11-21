package polyMorphism;

class Car {
	String color;
	int door;
	String brandName;
	
	void drive() {
		System.out.println("운전을 합니다.");
	}
	
	void stop() {
		System.out.println("정지 합니다.");
    }
} 
class FireEngine extends Car {
	void water() {
		System.out.println("물을 뿌립니다.");
	}
}


public class PolyMorphism_Casting {

	public static void main(String[] args) {
		// 상속
		Car car1 = new Car();
		car1.drive();
		car1.stop();
		System.out.println("--------------------------------");
		
		FireEngine fireEngine1 = new FireEngine();
		fireEngine1.drive();
		fireEngine1.stop();
		fireEngine1.water();
		System.out.println("--------------------------------");
		
		// 다형성
		Car car2 = new FireEngine(); // Up-Casting (자동 형변환 가능)
		car2.drive();
		car2.stop();
//		car2.water(); // 오류 : Unresolved compilation problem: The method water() is undefined for the type Car
		System.out.println("--------------------------------");
//		FireEngine fireEngine2 = (FireEngine) new Car(); // Down-Casting (명시적 Casting 필요)

		FireEngine fireEngine2= (FireEngine) car2; // Down-Casting
		fireEngine2.drive();
		fireEngine2.stop();
		fireEngine2.water();
		
		Car car = new Car();
		FireEngine1 fireEngine = null;
//		fireEngine = (FireEngine1) car;  // Compile 시에는 오류가 없음 => 실행 시 (runtime) 예외 (exception) 발생
										// polyMorphism.Car1 cannot be cast to polyMorphism.FireEngine1 
										// at polyMorphism.Casting2.main(Casting2.java:27)
		// -------- Up casting 후 Down Casting
		Car car3 = new FireEngine();
		FireEngine fireEngine3 = (FireEngine) car3;
		fireEngine2.drive();
		fireEngine2.water();	
	}

}


