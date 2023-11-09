
public class ScoreVer1 {

	public static void main(String[] args) {
		// 성적표 
		String name = "둘리";
		int kor = 98, eng = 34, math = 56;
		
		// 총점, 평균, 학점
		// Math.floor( )
		int total = kor + eng + math;
		float avg = total / 3f;
		
		avg = Math.round(avg * 100) / 100f;
		
		char grade = 'F';
		switch ((int)Math.floor(avg / 10)) {
		
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
			
		}
		
//		System.out.println("이름 : " + name + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 총점 : " + total + ", 평균 : " + avg + ", 학점 : " + grade);
		System.out.println("성적표");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 학점");
		System.out.println("====================================================");
		System.out.println(name + "\t " + kor + "\t " + eng +"\t " + math + "\t " + total + "\t " + avg + "\t " + grade);
		
	}

}
