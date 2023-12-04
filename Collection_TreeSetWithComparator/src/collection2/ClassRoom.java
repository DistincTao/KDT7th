package collection2;

import java.util.Set;
import java.util.TreeSet;

public class ClassRoom {
	private int classNo;
	private Set<Student> stuSet;
	
	// 생성자
	public ClassRoom(int classNo) {
		this.classNo = classNo;
//		this.stuSet = new TreeSet<Student>(new ComparatorManager().getComparator(comparatorNum));
		this.stuSet = new TreeSet<Student>();
//		this.stuSet = new TreeSet<Student>(new DescendingByScore());
//		this.stuSet = new TreeSet<Student>(new AccendingByName());
//		this.stuSet = new TreeSet<Student>(new DescendingByStuNo());
	}
	
	// getter, setter
	public int getClassNo() {
		return this.classNo;
	}

	public Set<Student> getStuSet() {
		return this.stuSet;
	}

	public void setStuSet(Set<Student> stuSet) {
		this.stuSet = stuSet;
	}

	public void addStudents(Student s) {
		boolean isStu = false;
		for (Student stu : this.stuSet) {
			if (stu.getStuNo().equals(s.getStuNo())) {
				isStu = true;
				break;
			}
		}
		if (!isStu) {
			this.stuSet.add(s);
		} else {
			System.out.println("학번 : " + s.getStuNo() + "이 존재합니다.");
		}
	}
	
	public void outputStudent() {
		for (Student s : this.stuSet) {
			System.out.println(s.toString());
		}
	}
	
	@Override
	public String toString() {
		return "반 : " + classNo + ", 학생들 : " + stuSet;
	}
	
}
