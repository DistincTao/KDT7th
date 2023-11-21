package polyMorphism_Binding;


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
		System.out.println("x = " + x); // 20
		System.out.println("super.x = " + super.x); // 10
		System.out.println("this.x = " + this.x); // 20
	}
}

public class BindingTest3 {

	public static void main(String[] args) {
		Parent p = new Child ();
		Child c = new Child ();
		
		System.out.println("p.x = " + p.x); // 10
		p.method();
		System.out.println("---------------------------");
		System.out.println("c.x = " + c.x); // 20
		c.method();
		

	}

}
