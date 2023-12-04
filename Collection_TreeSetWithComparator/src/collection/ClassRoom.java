package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ClassRoom {
	private int classNo;
	private Set <Student> stuSet;

	// 생성자
	public ClassRoom(int classNo, int comparatorNum) {
		this.classNo = classNo;
		this.stuSet = new TreeSet<Student>(new ComparatorManager().getComparator(comparatorNum));
//		this.stuSet = new TreeSet<Student>(compString);
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
		this.stuSet.add(s);
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
	
	Comparator <Student> compString = new Comparator <Student> () {
		
		@Override
		public int compare(Student s1, Student s2) {
				return s1.getStuNo().compareTo(s2.getStuNo());
		}	
	};
	
	Comparator <Student> compInt = new Comparator <Student> () {
		
		@Override
		public int compare(Student s1, Student s2) {
			if (s1.getScore() < s2.getScore()) { 
				return 1;
			} else if (s1.getScore() == s2.getScore()) {
				return 0;
			} else {
				return -1;
			}
		}	
	};
	
}
