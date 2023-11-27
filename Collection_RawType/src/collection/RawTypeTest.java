package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RawTypeTest {
	// raw 타입으로 생성된 ArrayList ar 에는 모든 데이터 타입이 저잘 될 수 있다.
	// -> 데이터 타입의 안정성을 보장하지 못한다. 그래서 Generic Type으로 사용할 것을 권고함
	public static void main(String[] args) {
		ArrayList ar = new ArrayList<>(); 
		// raw type 의 ArrayList 객체 생성 경고 메시지
		// => ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ar.add(10); // Type safety: The method add(Object) belongs to the raw type ArrayList. 
					 // References to generic type ArrayList<E> should be parameterized
		ar.add(3.14f);
		ar.add(3.141592);
		ar.add("대한민국");
		ar.add(new Computer());
		
		System.out.println(ar.toString());
		
		//Generic Type 으로 만들기
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("String만");
		ar2.add("저장됨");
//		ar2.add(new Computer()); // 오류 발생 : The method add(String) in the type ArrayList<String> is not applicable for the arguments (Computer)
		
		System.out.println(ar2);
		
//		ArrayList<int> ar3 = new ArrayList<>(); // Generic에는 참조 타입이 들어가야 한다!
		ArrayList<Integer> ar3 = new ArrayList<>();
		ar3.add(10);
		ar3.add(100);
		ar3.add(new Integer (100));
		
		System.out.println(ar3);
		
		List<String> ar4 = new ArrayList<>(); // 다형성 활용 가능
		List<String> ar5 = new Stack<>(); // ArrayList 에서 Stack으로 형 변경 => 하위 코드에 영향을 미치지 않는다.
		// 부모 인스턴스를 자식 인트턴스로 생성하여 활용하는 것을 자주 볼 수 있음
	}

}

class Computer {
	public String toString() {
		return "Computer";
	}
}