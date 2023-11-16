package score;

//import java.io.File;

public class Student {
	
	public static final int MAX_SCORE = 100;
	public static final int MIN_SCORE = 0;
	
	// 학번, 이름, 국어, 영어, 수학, 총점, 평균, 학점
	// 전체 학생의 총점
	// 각 과목의 점수는 0점 이상 100점 이하
	
	// 학생 객체 복사 생성자 만들기

	private String studNum;
	private String studName;
	private Integer kor;
	private Integer eng;
	private Integer math;
	private int tot;
	private double avg;
	private char grade;
	
	public Student () {
		
	}
	
	public Student(String studNum, String studName, String kor, String eng, String math) {
		this.studNum = studNum;
		this.studName = studName;
		this.kor = Integer.parseInt(kor);
		this.eng = Integer.parseInt(eng);
		this.math = Integer.parseInt(math);
		setScores();
	}
	
	public Student(Student s) {
		this.studNum = s.studNum;
		this.studName = s.studName;
		this.kor = s.kor;
		this.eng = s.eng;
		this.math = s.math;
		this.tot = s.tot;
		this.avg = s.avg;
		this.grade = s.grade;
	}

	public char setScores() {
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot / 3;
		int avgGrade = (int)(avg / 10);
		switch (avgGrade) {
			case 10 :
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default :
				grade = 'F';
		}
		return grade;
	}

	public String getStudNum() {
		return studNum;
	}
	
	public String getStudName() {
		return studName;
	}
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}

	public int getTot() {
		return tot;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public char getGrade() {
		return grade;
	}
	
	
	public void setStudNum(String studNum) {
		this.studNum = studNum;
	}

	public void setStudName(String studName) {
			this.studName = studName;
	}

//	public void setStudName(String studName, File certificates, boolean isApproved) {
//		if (isApproved) {
//			this.studName = studName;
//		}
//	}

	public void setKor(int kor) {
		if (kor >= MIN_SCORE && kor <= MAX_SCORE ) {
			this.kor = kor;
			setScores();
		}

	}

	public void setEng(int eng) {
		if (eng >= MIN_SCORE && eng <= MAX_SCORE ) {
			this.eng = eng;
		}
		setScores();
	}

	public void setMath(int math) {
		if (math >= MIN_SCORE && math <= MAX_SCORE ) {
			this.math = math;
		}
		setScores();
	}

	@Override
	public String toString() {
		return "Student [학번=" + studNum + ", 이름=" + studName + ", 국어=" + kor + ", 영어=" + eng + ", 수학="
				+ math + ", 총점=" + tot + ", 평균=" + avg + ", 학점=" + grade + "]";
	}
}
