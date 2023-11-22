package package2;
//Pet Class ⇒ (package 2) color, type, age, abstract doCry()
//
//Cat Class ⇒ (package 1) doCry()
//
//Dog Class ⇒ (package 1) doCry()
//
//PetDoctor Class ⇒ (package 2) clinic()
public abstract class Pet {
	private String color;
	private String type;
	private int age;
	
	public Pet() {
		
	}
	
	protected Pet(String color, String type, int age) {
		this.color = color;
		this.type = type;
		this.age = age;
	}

	public String getColor() {
		return this.color;
	}

	public String getType() {
		return this.type;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [색 =" + this.color + ", 종류 =" + type + ", 나이=" + age + "]";
	}
	
	public abstract String doCry();
	
	public String doEat() {
		return "먹이를 먹습니다.";
	}
	
}
