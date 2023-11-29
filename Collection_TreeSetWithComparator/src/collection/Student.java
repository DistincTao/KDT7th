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
		return Objects.hash(score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return score == other.score;
	}

	@Override
	public String toString() {
		return "학번 : " + stuNo + ", 이름 : " + name + ", 점수 : " + score;
	}
}
