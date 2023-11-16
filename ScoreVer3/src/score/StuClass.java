package score;

import java.util.Arrays;

public class StuClass {
	
	private int no;
	private String className;
	private Student[] studentArr;
	
	private int grossTotal;
	private double avgTotal;
	
	public static final int STU_CNT = 4;
	
	public StuClass(int no, String className) {
		this.no = no;
		this.className = className;
		this.studentArr = new Student[STU_CNT]; // Student 객체 배열 생성
	}
	
	public StuClass(int no, String className, Student[] studentArr) {
		this.no = no;
		this.className = className;
		this.studentArr = studentArr; 
		
	}


	public int getNo() {
		return this.no;
	}

	public String getClassName() {
		return this.className;
	}
	
	public Student[] getStudentArr() {
		return this.studentArr;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public void addStudent(Student student, int index) {
		// 학생 객체 배열에 학생을 추가
	    this.studentArr[index] = student;

	}
	

	@Override
	public String toString() {
		return "StuClass [반=" + no + ", 학급명=" + className + ", 학생=" + Arrays.toString(studentArr)
				+ ", 반 총점=" + grossTotal + ", 반 평균=" + avgTotal + "]";
	}


	public void outputAllStudent() {
		System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 학점");
		for (int i = 0; i < ScoreVer3.getCurrCnt(); i++) {
			System.out.println(studentArr[i].getStudentNo() + "\t" + studentArr[i].getStudentName() + "\t" + studentArr[i].getKor() + "\t" + studentArr[i].getEng() +
					"\t" + studentArr[i].getMath() + "\t"
					+ studentArr[i].getTot() + "\t" + studentArr[i].getAvg() + "\t" + studentArr[i].getGrade());
		}
		
	}
	
	public int calculateGrossTotal() {
		this.grossTotal = 0;
		for (int i = 0; i < ScoreVer3.getCurrCnt(); i++) {
			this.grossTotal += this.studentArr[i].getTot();
		}
		return grossTotal;
	}

	public double calculateAvgTotal() {
		this.avgTotal = Math.round(this.grossTotal / ScoreVer3.getCurrCnt() / 3 * 100) / 100;		
		return this.avgTotal;
	}

	public static void outputThisStudent(Student student) {
		
		System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 학점");
		System.out.println(student.getStudentNo() + "\t" + student.getStudentName() + "\t" + student.getKor() + "\t" + student.getEng() +
				"\t" + student.getMath() + "\t"
				+ student.getTot() + "\t" + student.getAvg() + "\t" + student.getGrade());
		
	}

	public void displayScoreByNo(String stuNo) {
		for (Student s : this.studentArr) {
			if (stuNo.equals(s.getStudentNo())) {
				System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 학점");
				System.out.println(s.getStudentNo() + "\t" + s.getStudentName() + "\t" + s.getKor() + "\t" + s.getEng() +
						"\t" + s.getMath() + "\t"
						+ s.getTot() + "\t" + s.getAvg() + "\t" + s.getGrade());

			}
		}
		
	}
	
	
}
