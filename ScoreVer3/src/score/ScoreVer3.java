package score;

import java.util.Scanner;

public class ScoreVer3 {
	private static Scanner sc = new Scanner(System.in);
	static int currSavedStudentCnt = 0; // 현재 생성된 학생 수
	
	public static int getCurrCnt() {
		return currSavedStudentCnt;
	}
	
	private StuClass createClass() {
		System.out.print("반 번호 입력 >>");
		int classNo = Integer.parseInt(sc.nextLine());
		
		System.out.print("반 이름 입력 >>");
		String className = sc.nextLine();
		
		StuClass class1 = new StuClass(classNo, className);
		System.out.println(class1.toString()); 
		
		return class1;
	}

	private void inputStudent(StuClass stuClass) {
		if (stuClass == null) {
			System.out.println("반이 없는데 어케 학생을 등록하니?");
			return;
		} else {
			if (currSavedStudentCnt < StuClass.STU_CNT) {
				
				System.out.println("학번 >>");
				String stuNo = sc.nextLine();
				
				System.out.println("이름 >>");
				String stuName = sc.nextLine();
				
				System.out.println("국어 >>");
				int kor = Integer.parseInt(sc.nextLine());
				
				System.out.println("영어 >>");
				int eng = Integer.parseInt(sc.nextLine());
				
				System.out.println("수학 >>");
				int math = Integer.parseInt(sc.nextLine());
				
				stuClass.addStudent(new Student(stuNo, stuName, kor, eng, math), currSavedStudentCnt);
				currSavedStudentCnt++;
			} else {
				System.out.println("학생 수 초과");
			}
		}
		
	}
	
	private void outputEntireStudent(StuClass stuClass) {
		System.out.println("=============================================");
		System.out.println("================== 성적표 =====================");
		System.out.println("=============================================");
		System.out.println("반 번호: " + stuClass.getNo() + "과정명 :" + stuClass.getClassName());
		stuClass.outputAllStudent();
		System.out.println("=============================================");
		System.out.println("반 총점 : " + stuClass.calculateGrossTotal());
		System.out.println("반 평균 : " + stuClass.calculateAvgTotal());
	}
	
	private StuClass autoCreation(StuClass stuClass) {
		Student[] studentArr = {new Student("2301", "고길동", 90, 80, 70),
				new Student("2302", "김둘리", 75, 65, 55),
				new Student("2303", "고희동", 78, 68, 58),
				new Student("2304", "이또치", 74, 64, 54)
		};
		currSavedStudentCnt = studentArr.length;
		stuClass = new StuClass(5, "java", studentArr);
		return stuClass;
	}
	
	private void searchStudent(StuClass stuClass) {
		System.out.println("학번 >>");
		String stuNo = sc.nextLine();
		
		for (int i = 0; i < currSavedStudentCnt; i++) {
			if (stuClass.getStudentArr()[i].getStudentNo().equals(stuNo)) {
				StuClass.outputThisStudent(stuClass.getStudentArr()[i]);
			}
		}
		
	}
			
	private void findStudentByNo(StuClass stuClass) {
		System.out.println("학번 >>");
		String stuNo = sc.nextLine();
		
		stuClass.displayScoreByNo(stuNo);
		
	}

	
	private static void outputMenu() {
		System.out.println("=============================================");
		System.out.println("================= 성적표 ver3 =================");
		System.out.println("=============================================");
		System.out.println("== 1. 반 생성");
		System.out.println("== 2. 생성된 반에 학생 입력(1번부터 실행)");
		System.out.println("== 3. 전체 학생 출력");
		System.out.println("== 4. 반, 학생 자동 생성");
		System.out.println("== 5. 학생 정보 조회");
		System.out.println("== 9. 종료");
		System.out.println("=============================================");
		System.out.println("메뉴 번호 입력 >>");

	}
	
	public static void main(String[] args) {

		ScoreVer3 sv = new ScoreVer3();
		StuClass stuClass = null;
		boolean repeat = true;
		while (repeat) {
			outputMenu();
			int menuNum = Integer.parseInt(sc.nextLine());
		
			switch (menuNum) {
				case 1 :
					stuClass = sv.createClass();
					break;
				case 2 :
					sv.inputStudent(stuClass);
					break;
				case 3 :
					sv.outputEntireStudent(stuClass);
					break;
				case 4 :
					stuClass = sv.autoCreation(stuClass);
//					sv.autoCreation(stuClass);
					break;
				case 5 :
//					sv.searchStudent(stuClass);
					sv.findStudentByNo(stuClass);
					break;
				case 9 :
					System.exit(0);
					break;
			}
		}
			
	}





}
