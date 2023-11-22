package department;

import employees.Formal;
import employees.Part;

public class CompanyEx1 {
	public static void main(String[] args) {
		
		Part a = new Part("희동", "Part", 12, 20);
		a.toDo();
		a.toOverTime();
		Formal b = new Formal("희동", "Part", 12, 20);
		b.toDo();
		b.toOverTime(10);
	
		
		
		Department 영업팀 = new Department("영업팀");
		영업팀.addMemebers(new Formal("둘리", "Full", 1500000, 0));
		영업팀.addMemebers(new Part("희동", "Part", 12, 20));
		영업팀.addMemebers(new Formal("영희", "Full", 2000000, 10));
		영업팀.addMemebers(new Part("철수", "Part", 10, 25));
		영업팀.addMemebers(new Formal("또치", "Full", 3000000, 20));
		영업팀.addMemebers(new Part("마이콜", "Part", 8, 8));
		영업팀.addMemebers(new Formal("도우너", "Full", 4500000, 30));
		영업팀.addMemebers(new Part("고길동", "Part", 3, 30));
		
		영업팀.deleteMemebers("마이콜");
		영업팀.addMemebers(new Part("마이콜 동생", "Part", 8, 28));
		
		
		Accountant 워렌버핏 = new Accountant("워렌버핏");
		
		워렌버핏.calculatePay(영업팀);
	}
}
