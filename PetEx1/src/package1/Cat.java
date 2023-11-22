package package1;

import package2.Pet;

public class Cat extends Pet{
	String name;
	String specific;

	public Cat () {
		
	}
	
	public Cat (String color, String type, int age, String name, String specific) {
		super(color, type, age);
		this.name = name;
		this.specific = specific;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSpecific() {
		return this.specific;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecific(String specific) {
		this.specific = specific;
	}

	@Override
	public String toString() {
		return name + "[색상 = " + super.getColor() + ", 종류 = " + super.getType() + ", 종 = " + this.getSpecific() + ", 나이 = " + super.getAge() + "살]";
	}

	@Override
	public String doCry() {
		return "야옹야옹야옹";
	}
	
	public String doLand() {
		return "몸을 비틀어 착지합니다.";
	}
}

