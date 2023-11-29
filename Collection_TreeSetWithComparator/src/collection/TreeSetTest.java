package collection;

public class TreeSetTest {

	public static void main(String[] args) {

		// 반 생성
		ClassRoom class1 = new ClassRoom(1, 2);
		
		Student s1 = new Student ("23001", "둘리", 30);
		Student s2 = new Student ("23002", "또치", 90);
		Student s3 = new Student ("23003", "희동", 68);
		Student s4 = new Student ("23004", "길동", 45);
		Student s5 = new Student ("23005", "철수", 45);
		Student s6 = new Student ("23006", "영희", 30);
		Student s7 = new Student ("23007", "도우너", 90);
		Student s8 = new Student ("23001", "마이콜", 68);
		Student s9 = new Student ("23002", "둘리엄마", 45);
		Student s10 = new Student ("23003", "길동아내", 45);
		
		class1.addStudents(s1); // collection.Student cannot be cast to java.lang.Comparable
		class1.addStudents(s2);
		class1.addStudents(s5);
		class1.addStudents(s3);
		class1.addStudents(s4);
		class1.addStudents(s5);
		class1.addStudents(s6);
		class1.addStudents(s7);
		class1.addStudents(s8);
		class1.addStudents(s9);
		class1.addStudents(s10);

		
		class1.outputStudent();
		
		
		
	}
}
