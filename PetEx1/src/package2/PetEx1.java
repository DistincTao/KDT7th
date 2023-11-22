package package2;

//import package1.Cat;
//import package1.Dog;
import package1.*;

public class PetEx1 {

	public static void main(String[] args) {
		Cat 나비 = new Cat ("흰색", "고양이", 3, "나비", "페르시안");
		나비.doCry();
		System.out.println(나비.toString());
		Dog 멍뭉이 = new Dog ("흑백", "강아지", 12, "멍뭉이", "핏불");
		멍뭉이.doCry();
		System.out.println(멍뭉이.toString());
		
		PetDoctor 이국종 = new PetDoctor("이국종", 54);
		이국종.doClinic(나비);
		이국종.doClinic(멍뭉이);
		이국종.doClinic(new Cat("얼룩", "고양이", 8, "야옹이", "샴"));
		
		Pet 우리집애완동물 = new Dog("검정", "강아지", 10, "해피", "허스키");
		// 부모 클래스에만 있는 메소드는 호출 가능
		System.out.println(우리집애완동물.doCry());
		 // 자식 클래스에서만 가지고 있는 메소드는 부모 클래스에서 호출 불가
//		System.out.println(우리집애완동물.doWag());
//		System.out.println(우리집애완동물.doLand());
		이국종.doClinic(우리집애완동물);
		
		Dog dogFortune = (Dog) 우리집애완동물;
//		dogFortune.doJump(); // Cat 객체만 가지고 있는 메소드 호출 불가
		System.out.println(dogFortune.doWag());;
		System.out.println(dogFortune.doCry());;
		System.out.println(dogFortune.doEat());;
		
		System.out.println(멍뭉이.doWag());;
		System.out.println(멍뭉이.doEat());;
		
		System.out.println(나비.doLand());;
		System.out.println(나비.doEat());;
	}
}
