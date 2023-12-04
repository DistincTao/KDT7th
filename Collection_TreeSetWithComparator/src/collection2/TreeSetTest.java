package collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		// 반 생성
		ClassRoom class1 = new ClassRoom(1);

		Student s1 = new Student ("23001", "둘리", 30);
		Student s2 = new Student ("23002", "또치", 90);
		Student s3 = new Student ("23003", "희동", 68);
		Student s4 = new Student ("23004", "길동", 45);
		Student s5 = new Student ("23005", "철수", 45);
		Student s6 = new Student ("23006", "영희", 30);
		Student s7 = new Student ("23007", "도우너", 90);
		Student s8 = new Student ("23001", "마이콜", 68);
		Student s9 = new Student ("23002", "희동", 45);
		Student s10 = new Student ("23003", "도우너", 45);

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
		
		while (true) {
			System.out.println("================================================================");
			System.out.println("==== 1. 학번순 ");
			System.out.println("==== 2. 이름순 ");
			System.out.println("==== 3. 성적순");
			System.out.println("================================================================");
			System.out.print("정렬 기준을 선택하세요......");
			
			Scanner sc = new Scanner (System.in);
			int num = sc.nextInt();
			Set <Student> output = new TreeSet<Student>(ComparatorManager.getComparator(num));
			output.addAll(class1.getStuSet()); // Collection에 Collection 추가
			
			for (Student s : output) {
				System.out.println(s.toString());
				
			sc.close();
			}
		}

		

	}
}
