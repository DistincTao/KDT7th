package polyMorphism;

abstract class Car1 {
	String color;
	int door;
	String brandName;
	
	void drive() {
		System.out.println("운전을 합니다.");
	}
	
	void stop() {
		System.out.println("정지 합니다.");
	}
	abstract void water(); // 추상 메소드
}

class FireEngine1 extends Car1 {
	@Override
	void water() {
		System.out.println("물을 뿌립니다.");
	}
}

public class Casting2 {

	public static void main(String[] args) {
		// 상속
		
		FireEngine1 fireEngine1 = new FireEngine1();
		fireEngine1.drive();
		fireEngine1.stop();
		fireEngine1.water();
		System.out.println("--------------------------------");
		
		// 다형성
		Car1 car2 = new FireEngine1(); // Up-Casting (자동 형변환 가능)
		car2.drive();
		car2.stop();
		car2.water(); // Car 클래스에서 추상 메소드로 선언 시 자손에서 생성한 해당 메소드를 부모 클래스에서도 사용 가능
		System.out.println("--------------------------------");
	}
}
