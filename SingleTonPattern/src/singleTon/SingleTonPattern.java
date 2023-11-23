package singleTon;

import java.util.Calendar;

public class SingleTonPattern {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); // singleton pattern 에서는  new 생성자로 객체 생성 불가
		// 오류 => Unresolved compilation problems: The constructor Singleton() is not visible
		// Cannot instantiate the type Calendar

		for (int i = 0; i < 5; i++) { // 여러번 생성을 하더라도 1개의 객체만 생성 => hashCode 동일
			Singleton s1 = Singleton.getInstance();
			System.out.println(s1.hashCode());			
		}

		for (int i = 0; i < 10; i++) { // 완벽한 singleton pattern 은 아니지만 유사한 경우
			Calendar c = Calendar.getInstance();
			System.out.println(c.hashCode()); 
		}
//		Calendar c1 = new Calendar(); // 오류 발생 Unresolved compilation problem: Cannot instantiate the type Calendar
	}
	
}  