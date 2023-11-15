package score;

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
	
	
	public Student(String studNum, String studName, String kor, String eng, String math) {
		this.studNum = studNum;
		this.studName = studName;
		this.kor = Integer.parseInt(kor);
		this.eng = Integer.parseInt(eng);
		this.math = Integer.parseInt(math);
		this.tot = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
		this.avg = this.tot / 3;
		this.grade = setGrade(this.avg);
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

	public char setGrade(double avg) {
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

	public void setKor(int kor) {
		this.kor = kor;
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot / 3;
		this.avg = setGrade(this.avg);
	}

	public void setEng(int eng) {
		this.eng = eng;
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot / 3;
		this.avg = setGrade(this.avg);
	}

	public void setMath(int math) {
		this.math = math;
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot / 3;
		this.avg = setGrade(this.avg);
	}

	@Override
	public String toString() {
		return "Student [studNum=" + studNum + ", studName=" + studName + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", tot=" + tot + ", avg=" + avg + ", grade=" + grade + "]";
	}
}
