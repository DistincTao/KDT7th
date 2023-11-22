package department;

import java.util.Arrays;

import employees.Employees;

public class Department {
	private String name;
	public Employees[] member = new Employees[10];
	int i = 0;
	
	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Employees[] getMember() {
		return this.member;
	}

	public void setMember(Employees[] member) {
		this.member = member;
	}
	
	public void addMemebers(Employees e) {
		for (int i = 0; i < member.length; i++) {
			if (member[i] == null) break;
		}
		member[i++] = e;
	}
	
	public void deleteMemebers(String name) {
		for (int i = 0; i < member.length; i++) {
			if (member[i] != null) {
				if (member[i].getName().equals(name)) {
					member[i] = null;
				}
			};
		}
	}

	@Override
	public String toString() {
		return name + ", 팀원" + Arrays.toString(this.member);
	}
	
	
}
