package polyMorphism;

class Parent {
	int x = 10;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	
}

public class BindingTest1 {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x : " + p.x);
		System.out.println("c.x : " + c.x);
		
		p.method();
		c.method();

	}

}
