package package2;

public class PetDoctor {
	private String name;
	private int age;
	
	public PetDoctor() {
		
	}
	
	public PetDoctor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "수의사 [name=" + name + "]";
	}
	
	public void doClinic(Pet p) {
		System.out.println(p.toString() + "을/를 " + this.getName() + " 선생님(" + this.getAge() + ")이 치료합니다. 대답해야지? " +  p.doCry());
	}
}
