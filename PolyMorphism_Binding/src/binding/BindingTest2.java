package binding;

class Parent {
	int x = 10;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 20;
	
//  @Override
	void method() {
		System.out.println("Child Method");
	}
}

public class BindingTest2 {

	public static void main(String[] args) {
//		Parent p = new Parent();
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x : " + p.x); // 10
		System.out.println("c.x : " + c.x); // 20
		
		p.method(); // Parent Method => Child Method
		c.method(); // Child Method

	}

}
