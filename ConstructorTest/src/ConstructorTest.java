class Data1 {
	int num;
//	Data1(){ // => 기본 생성자는 컴파일러가 자동으로 생성함
//		System.out.println ("BBI ~~~~~")
//	}; 
}

class Data2 {
	int num;
	
//	Data2 () {}
	Data2(int x) { // 생성자를 overloading 하여 새로운 생성자를 생성 (기본 또는 직접 작성한 생성자는 최소 1개 이상은 있어야 함)
		num = x;
		System.out.println("int 매개변수가 num 맴버변수에 잘 들어갔음");
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		System.out.println(d1.hashCode());
		
		Data2 d2 = new Data2(3);
//		Data2 d2 = new Data2(); //  기본 생성자 없이 생성 시 오류 발생 (The constructor Data2() is undefined)
		System.out.println(d2.num);
		
	}
}
