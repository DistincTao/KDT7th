package score;

import java.util.Scanner;

public class ScoreVer2 {

	public static Student[] studentArr = new Student[10];
	public static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {

		boolean repeat = true;
		while (repeat) {
			
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("1. 학생 정보 등록 | 2. 점수 조회 | 3. 전체 총합 | 4. 성적 변경| 5. 학생 성적 복사 하기 | 6. 종료");
			System.out.println("---------------------------------------------------------------------------------");
			
			System.out.println("선택 >>>> ");
			String selectNo = sc.nextLine();
			if(("").equals(selectNo) || selectNo == null){
					main(args);
			}
			
			switch (Integer.parseInt(selectNo)) {
			case 1 : 
				// 학생 정보 생성 메소드 호출
				createStudent();
				break;
			case 2 : 
				// 점수 조회 메소드 호출
				scoreList();
				break;
			case 3 : 
				// 전체 학생 점수 총합 호출
				totalScore();
				break;
			case 4 :
				changeScore();
				break;
			case 5 :
				cloneScore();
				break;
			case 6 : 
				// 종료 메소드 호출
				System.exit(0);
				break;
			}
		}
	}
	
	public static void createStudent() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("1. 학생 정보 등록");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("학번 등록 >>");
		String studNum = sc.nextLine();
		
		System.out.println("이름 등록 >>");
		String studName = sc.nextLine();
		
		System.out.println("국어 점수 등록 >>");
		String kor = sc.nextLine();
		if(("").equals(kor) || kor == null){
			System.out.println("국어 점수 등록 >>");
			kor = sc.nextLine();
		} else if (Integer.parseInt(kor) < Student.MIN_SCORE || Integer.parseInt(kor) > Student.MAX_SCORE) {
			System.out.println("점수를 다시 입력해 주세요.");
			System.out.println("국어 점수 다시 등록 >>");
			kor = sc.nextLine();
		}
		
		System.out.println("영어 점수 등록 >>");
		String eng = sc.nextLine();
		if(("").equals(kor) || kor == null){
			System.out.println("영어 점수 등록 >>");
			eng = sc.nextLine();
		} else if (Integer.parseInt(eng) < Student.MIN_SCORE || Integer.parseInt(eng) > Student.MAX_SCORE) {
		System.out.println("점수를 다시 입력해 주세요.");
		System.out.println("영어 점수 다시 등록");
		eng = sc.nextLine();
		}
		
		System.out.println("수학 점수 등록 >>");
		String math = sc.nextLine();
		if(("").equals(kor) || kor == null){
			System.out.println("수학 점수 등록 >>");
			math = sc.nextLine();
		} else if (Integer.parseInt(math) < Student.MIN_SCORE || Integer.parseInt(math) > Student.MAX_SCORE) {
			System.out.println("점수를 다시 입력해 주세요.");
			System.out.println("수학 점수 다시 등록 >>");
			math = sc.nextLine();
		}
		
		Student newStudent = new Student(studNum, studName, kor, eng, math);
		System.out.println(newStudent.toString());
		
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i] == null) {
				studentArr[i] = newStudent;
				break;
			}
		}	
	}
	
	public static void scoreList() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("2. 성적 조회");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 학점");
		
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i] != null) {
				System.out.print(studentArr[i].getStudNum() + "\t");
				System.out.print(studentArr[i].getStudName() + "\t");
				System.out.print(studentArr[i].getKor() + "\t");
				System.out.print(studentArr[i].getEng() + "\t");
				System.out.print(studentArr[i].getMath() + "\t");
				System.out.print(studentArr[i].getTot() + "\t");
				System.out.print(studentArr[i].getAvg() + "\t");
				System.out.print(studentArr[i].getGrade() + "\t");
				System.out.println();
			}
		}
	}
	
	public static void totalScore() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("3. 전체 총합");
		System.out.println("---------------------------------------------------------------------------------");
		
		int totalScore = 0;
		
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i] != null) {
				totalScore += studentArr[i].getTot();
			}
		}
		System.out.println(totalScore);
	}
		
	public static void changeScore() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("4. 성적 변경");
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("변경하고자 하는 학번>>");
		String studNum = sc.nextLine();
		
		System.out.println("변경하고자 하는 과목>>");
		String wantClass = sc.nextLine();
		
		System.out.println("변경하고자 하는 점수>>");
		int changedScore = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i] != null) {
				if (studentArr[i].getStudNum().equals(studNum)) {
					if (wantClass.equals("kor") ) {
						studentArr[i].setKor(changedScore);
					} else if (wantClass.equals("eng")) {
						studentArr[i].setEng(changedScore);
					} else if (wantClass.equals("math")) {
						studentArr[i].setMath(changedScore);
					}
				}
			}
		}
	}
	public static void cloneScore() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("5. 학생 성적 복사 하기");
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("복사하고자 하는 학번>>");
		String studNum = sc.nextLine();
		Student newStudent = null;
		
		System.out.println("등록하고자 하는 학번>>");
		String newStudNum = sc.nextLine();
		
		System.out.println("변경하고자 하는 이름>>");
		String newStudName = sc.nextLine();
		
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i] != null && studentArr[i].getStudNum().equals(studNum)) {
				newStudent = new Student(studentArr[i]);
				newStudent.setStudNum(newStudNum);
				newStudent.setStudName(newStudName);
			}
		}
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i] == null) {
				studentArr[i] = newStudent;
				break;	
			}
		}
		System.out.println(newStudent.toString());
	}
	
}
