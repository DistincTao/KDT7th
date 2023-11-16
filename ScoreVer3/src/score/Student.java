package score;

public class Student {
   
   // 학번, 이름, 국어, 영어, 수학, 총점, 평균, 학점
   // 전체학생의 총점
   // 각 과목의 점수는 0점 이상 100점이하
   // 학생 객체 복사 생성자 만들기.
   
// 1. 인스턴스 변수 선언   
   private String studentNo; // 앞에0이있는 경우 때문에 string으로 해야한다
   private String studentName;
   private int kor;
   private int eng;
   private int math;
   private int tot;
   private double avg;  
   private char grade;
   
// 2. 생성자
   public Student() {
      // TODO Auto-generated constructor stub
   }

// 3. 생성자 오버로딩
   public Student(String studentNo, String studentName,int kor,int eng,int math) {
      this.studentNo = studentNo; 
      this.studentName = studentName;
      
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      
      
      this.tot = this.kor + this.eng + this.math;
      this.avg = Math.round(this.tot / 3 * 100) /100;
         
      setTot();
      setAvg();
      setGrade(); // 3개 계속 호출해야 하니 하나의 메서드로 묶는게좋음

}
   // 
   public Student(Student originStudent) {
      this.studentNo = originStudent.studentNo;
      this.studentName = originStudent.studentName;
      this.kor = originStudent.kor;
      this.eng = originStudent.eng;
      this.math = originStudent.math;
      this.tot = originStudent.tot;
      this.avg = originStudent.avg;
      this.grade = originStudent.grade;
   }
   
   

// 4. 게터,세터
   public String student() {
	      return this.studentNo;
	   }
   
   public String getStudentName() {
      return this.studentName;
   }
   
   public String getStudentNo() {
	      return this.studentNo;
	   }

   public int getKor() {
      return this.kor;
   }
   
   public int getEng() {
      return this.eng;
   }
   
   public int getMath() {
      return this.math;
   }
   
   public int getTot() {
      return this.tot;
      
   }
   
   public double getAvg() {
	  return this.avg;
   }
   
   public char getGrade() {
	  return this.grade;
   }

   public void setKor(int kor) {
      if (kor >= 0 && kor <= 100) {
         this.kor = kor;
         setTot();
         setAvg();
         setGrade();
      }
   }

   public void setEng(int eng) {
      if (eng >= 0 && eng <= 100) {
         this.eng = eng;
         setTot();
         setAvg();
         setGrade();
      }
   }

   public void setMath(int math) {
      if (math >= 0 && math <= 100) {
         this.math = math;
         setTot();
         setAvg();
         setGrade();
      }
   }

   public void setTot() {
      
      this.tot = this.kor + this.eng + this.math;
   }
   
   
   public void setAvg() {
      this.avg = this.tot / 3f;
   }
   
   public void setGrade() {
      switch((int)(this.avg / 10)) {
      case 10:
      case 9:
         this.grade = 'A';
         break;
      case 8:
         this.grade = 'B';
         break;
      case 7:
         this.grade = 'C';
         break;
      case 6:
         this.grade = 'D';
         break;
      default:
         this.grade ='F';
      }
   }
   
   @Override
   public String toString() {
      return "Student [studentNum=" + studentNo + ", studentName=" + studentName + ", kor=" + kor + ", eng=" + eng
            + ", math=" + math + ", sum=" + tot + ", avg=" + avg + ", grade=" + grade + "]";
   }



   
}