package collection;

import java.util.Objects;

public class Student {
	private String stuNo;
	private String name;
	private int score;

	// 생성자
	public Student(String stuNo, String name, int score) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
	}

	public String getStuNo() {
		return this.stuNo;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		int hash = Objects.hash(stuNo);
		if (hash < 0) {
			hash *= -1;		 
		}
		return hash;
	} 

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		} 	
		Student kor = (Student)obj;
		return this.stuNo.equals(kor.stuNo);
	}

	@Override
	public String toString() {
		return "학번 : " + stuNo + ", 이름 : " + name + ", 점수 : " + score;
	}
}
